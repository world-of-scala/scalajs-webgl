package org.worldofscala.webglaminar

import org.worldofscala.webgl.*
import org.scalajs.dom.HTMLCanvasElement
import com.raquo.laminar.api.L.*
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom.window
import org.scalajs.dom.WebGL2RenderingContext

def webglCanvas(
  vertexShader: String,
  fragmentShader: String,
  modifiers: Modifier[ReactiveHtmlElement[HTMLCanvasElement]]*
)(welgl: WebGLContexts => Unit): ReactiveHtmlElement[HTMLCanvasElement] =
  canvasTag(
    modifiers,
    onMountCallback { mc =>
      val canvas = mc.thisNode.ref
      canvas.width = (window.innerWidth * 0.80).toInt
      canvas.height = (window.innerHeight * 0.80).toInt
      val gl      = canvas.getWebGLContext()
      val program = gl.initShaderProgram(vertexShader, fragmentShader)

      gl.useProgram(program)
      welgl(WebGLContexts(gl, program))
    }
  )
