package org.worldofscala.webgl

import org.scalajs.dom.HTMLCanvasElement

import org.scalajs.dom.{WebGLBuffer, WebGLProgram, WebGLRenderingContext => GL}

extension (htmlCanvas: HTMLCanvasElement) def getWebGLContext() = htmlCanvas.getContext("webgl").asInstanceOf[GL]
