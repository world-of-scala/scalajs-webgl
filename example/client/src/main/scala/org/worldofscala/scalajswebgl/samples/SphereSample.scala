package org.worldofscala.scalajswebgl.samples

import org.worldofscala.webglaminar.*
import org.scalajs.dom.{WebGLRenderingContext => GL}
import scala.scalajs.js.typedarray.*
import scala.scalajs.js.JSConverters.*

object SphereSample {

  // Simple shaders (same as Shaders.scala for now)
  val vertexShader =
    """|#version 300 es
       |
       |in vec4 vertexPosition;
       |uniform mat4 projectionMatrix;
       |uniform mat4 modelViewMatrix;
       |
       |void main() {
       |  gl_Position = projectionMatrix * modelViewMatrix * vertexPosition;
       |}
"""

  val fragmentShader =
    """|#version 300 es
       |precision highp float;
       |
       |out vec4 fragColor;
       |
       |void main() {
       |  fragColor = vec4(0.0, 0.5, 1.0, 1.0); // Blue sphere
       |}
"""

  // Helper function to create sphere geometry
  def createSphere(radius: Float, latitudeBands: Int, longitudeBands: Int): (Array[Float], Array[Int]) = {
    val vertices = scala.collection.mutable.ArrayBuffer[Float]()
    val indices  = scala.collection.mutable.ArrayBuffer[Int]()

    for (latNumber <- 0 to latitudeBands) {
      val theta    = latNumber * Math.PI / latitudeBands
      val sinTheta = Math.sin(theta)
      val cosTheta = Math.cos(theta)

      for (longNumber <- 0 to longitudeBands) {
        val phi    = longNumber * 2 * Math.PI / longitudeBands
        val sinPhi = Math.sin(phi)
        val cosPhi = Math.cos(phi)

        val x = cosPhi * sinTheta
        val y = cosTheta
        val z = sinPhi * sinTheta

        vertices += (radius * x).toFloat
        vertices += (radius * y).toFloat
        vertices += (radius * z).toFloat
      }
    }

    for (latNumber <- 0 until latitudeBands) {
      for (longNumber <- 0 until longitudeBands) {
        val first  = (latNumber * (longitudeBands + 1)) + longNumber
        val second = first + longitudeBands + 1

        // Ensure indices are treated as Short
        indices += first.toShort
        indices += second.toShort
        indices += (first + 1).toShort

        indices += second.toShort
        indices += (second + 1).toShort
        indices += (first + 1).toShort
      }
    }

    (vertices.toArray, indices.toArray)
  }

  def apply() = webglCanvas(vertexShader, fragmentShader) { ctx =>
    val gl = ctx.gl2

    val radius                  = 0.8f
    val latitudeBands           = 30
    val longitudeBands          = 30
    val (vertexData, indexData) = createSphere(radius, latitudeBands, longitudeBands)

    // --- Vertex Buffer ---
    val vertexBuffer = gl.createBuffer()
    gl.bindBuffer(GL.ARRAY_BUFFER, vertexBuffer)
    gl.bufferData(GL.ARRAY_BUFFER, new Float32Array(vertexData.toJSArray), GL.STATIC_DRAW)

    // --- Index Buffer ---
    val indexBuffer = gl.createBuffer()
    gl.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, indexBuffer)
    // Use Uint16Array as indices are Short (16-bit)
    gl.bufferData(GL.ELEMENT_ARRAY_BUFFER, new Uint16Array(indexData.toJSArray), GL.STATIC_DRAW)

    // --- Attributes ---
    val vertexPosition = gl.getAttribLocation(ctx.program, "vertexPosition")
    gl.enableVertexAttribArray(vertexPosition)
    // Ensure the buffer is bound before setting the pointer
    gl.bindBuffer(GL.ARRAY_BUFFER, vertexBuffer)
    gl.vertexAttribPointer(vertexPosition, 3, GL.FLOAT, false, 0, 0) // 3 components per vertex (x, y, z)

    // --- Uniforms (Simple identity matrices for now) ---
    val projectionMatrixLocation = gl.getUniformLocation(ctx.program, "projectionMatrix")
    val modelViewMatrixLocation  = gl.getUniformLocation(ctx.program, "modelViewMatrix")

    // Create identity matrices (replace with actual camera/model matrices later)
    val projectionMatrix = mat4.identity(mat4.create())
    val modelViewMatrix  = mat4.identity(mat4.create())

    gl.uniformMatrix4fv(projectionMatrixLocation, false, projectionMatrix)
    gl.uniformMatrix4fv(modelViewMatrixLocation, false, modelViewMatrix)

    // --- Drawing ---
    gl.clearColor(0.1f, 0.1f, 0.1f, 1.0f) // Set clear color
    gl.clear(GL.COLOR_BUFFER_BIT | GL.DEPTH_BUFFER_BIT)
    gl.enable(GL.DEPTH_TEST) // Enable depth testing for 3D

    // Bind the index buffer before drawing
    gl.bindBuffer(GL.ELEMENT_ARRAY_BUFFER, indexBuffer)
    gl.drawElements(GL.TRIANGLES, indexData.length, GL.UNSIGNED_SHORT, 0) // Use UNSIGNED_SHORT for indices
  }
}

// Minimal Matrix library dependency (replace with a proper one like glMatrix)
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("gl-matrix", "mat4")
object mat4 extends js.Object {
  def create(): Float32Array                    = js.native
  def identity(out: Float32Array): Float32Array = js.native
  // Add other matrix functions as needed (perspective, lookAt, translate, rotate, etc.)
}
