package org.worldofscala.scalajswebgl.app

import com.raquo.laminar.api.L.*

object HomePage:

  def apply(): HtmlElement =
    div(
      h1("Scala.js WebGL"),
      ul(
        demo("WebGL Sample", Router.uiRoute("webgl")),
        demo("Shaders", Router.uiRoute("webgl", "shaders")),
        demo("Triangle", Router.uiRoute("webgl", "adammurray", "triangle")),
        demo("Laminar WebGL Sample", Router.uiRoute("webgl", "detect"))
      )
    )

  def demo(title: String, link: String) =
    li(
      a(
        href := link,
        title
      )
    )
