package org.worldofscala.scalajswebgl.app

import dev.cheleb.scalamigen.*
import dev.cheleb.scalamigen.ui5.UI5WidgetFactory

import dev.cheleb.ziotapir.laminar.*

import org.worldofscala.scalajswebgl.domain.*

given Defaultable[Cat] with
  def default = Cat("")

given Defaultable[Dog] with
  def default = Dog("", 1)

given Form[Password] = secretForm(Password(_))

given f: WidgetFactory = UI5WidgetFactory

given session: Session[UserToken] = SessionLive[UserToken]
