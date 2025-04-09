package THREE

import scala.scalajs.js
import scala.scalajs.js.annotation._
import scala.scalajs.js.|

/**
 * A class representing an RGB color.
 *
 * A Color instance is represented by RGB components in the linear working color
 * space, which defaults to LinearSRGBColorSpace. Inputs conventionally using
 * SRGBColorSpace (such as hexadecimals and CSS strings) are converted to the
 * working color space automatically.
 */
@js.native
@JSImport("three", "Color")
class Color(
  var r: js.UndefOr[Double | String | Color] = js.undefined,
  var g: js.UndefOr[Double] = js.undefined,
  var b: js.UndefOr[Double] = js.undefined
) extends js.Object {

  /** Flag for type testing */
  val isColor: Boolean = js.native

  /**
   * Sets the color's components from the given values
   */
  def set(
    r: Double | String | Color,
    g: js.UndefOr[Double] = js.undefined,
    b: js.UndefOr[Double] = js.undefined
  ): this.type = js.native

  /**
   * Sets the color's components to the given scalar value
   */
  def setScalar(scalar: Double): this.type = js.native

  /**
   * Sets this color from a hexadecimal value
   */
  def setHex(hex: Double, colorSpace: js.UndefOr[String] = js.undefined): this.type = js.native

  /**
   * Sets this color from RGB values
   */
  def setRGB(r: Double, g: Double, b: Double, colorSpace: js.UndefOr[String] = js.undefined): this.type = js.native

  /**
   * Sets this color from HSL values
   */
  def setHSL(h: Double, s: Double, l: Double, colorSpace: js.UndefOr[String] = js.undefined): this.type = js.native

  /**
   * Sets this color from a CSS-style string
   */
  def setStyle(style: String, colorSpace: js.UndefOr[String] = js.undefined): this.type = js.native

  /**
   * Sets this color from a color name
   */
  def setColorName(style: String, colorSpace: js.UndefOr[String] = js.undefined): this.type = js.native

  /**
   * Returns a new color with copied values from this instance
   */
  @JSName("clone")
  def jsClone(): Color = js.native

  /**
   * Copies the values of the given color to this instance
   */
  def copy(color: Color): this.type = js.native

  /**
   * Copies given color into this color, and converts from SRGB to Linear color
   * space
   */
  def copySRGBToLinear(color: Color): this.type = js.native

  /**
   * Copies given color into this color, and converts from Linear to SRGB color
   * space
   */
  def copyLinearToSRGB(color: Color): this.type = js.native

  /**
   * Converts this color from SRGB to Linear color space
   */
  def convertSRGBToLinear(): this.type = js.native

  /**
   * Converts this color from Linear to SRGB color space
   */
  def convertLinearToSRGB(): this.type = js.native

  /**
   * Returns the hexadecimal value of this color
   */
  def getHex(colorSpace: js.UndefOr[String] = js.undefined): Double = js.native

  /**
   * Returns the hexadecimal value of this color as a string
   */
  def getHexString(colorSpace: js.UndefOr[String] = js.undefined): String = js.native

  /**
   * Converts the colors RGB values into the HSL format and stores them into the
   * given target object
   */
  def getHSL(target: js.Object, colorSpace: js.UndefOr[String] = js.undefined): js.Object = js.native

  /**
   * Returns the RGB values of this color and stores them into the given target
   * object
   */
  def getRGB(target: Color, colorSpace: js.UndefOr[String] = js.undefined): Color = js.native

  /**
   * Returns the value of this color as a CSS style string
   */
  def getStyle(colorSpace: js.UndefOr[String] = js.undefined): String = js.native

  /**
   * Adds the given HSL values to this color's values
   */
  def offsetHSL(h: Double, s: Double, l: Double): this.type = js.native

  /**
   * Adds the RGB values of the given color to the RGB values of this color
   */
  def add(color: Color): this.type = js.native

  /**
   * Adds the RGB values of the given colors and stores the result in this
   * instance
   */
  def addColors(color1: Color, color2: Color): this.type = js.native

  /**
   * Adds the given scalar value to the RGB values of this color
   */
  def addScalar(s: Double): this.type = js.native

  /**
   * Subtracts the RGB values of the given color from the RGB values of this
   * color
   */
  def sub(color: Color): this.type = js.native

  /**
   * Multiplies the RGB values of the given color with the RGB values of this
   * color
   */
  def multiply(color: Color): this.type = js.native

  /**
   * Multiplies the given scalar value with the RGB values of this color
   */
  def multiplyScalar(s: Double): this.type = js.native

  /**
   * Linearly interpolates this color's RGB values toward the RGB values of the
   * given color
   */
  def lerp(color: Color, alpha: Double): this.type = js.native

  /**
   * Linearly interpolates between the given colors and stores the result in
   * this instance
   */
  def lerpColors(color1: Color, color2: Color, alpha: Double): this.type = js.native

  /**
   * Linearly interpolates this color's HSL values toward the HSL values of the
   * given color
   */
  def lerpHSL(color: Color, alpha: Double): this.type = js.native

  /**
   * Sets the color's RGB components from the given 3D vector
   */
  def setFromVector3(v: Vector3): this.type = js.native

  /**
   * Transforms this color with the given 3x3 matrix
   */
  def applyMatrix3(m: Matrix3): this.type = js.native

  /**
   * Returns true if this color equals the given one
   */
  def equals(c: Color): Boolean = js.native

  /**
   * Sets this color's RGB components from the given array
   */
  def fromArray(array: js.Array[Double], offset: Double = 0): this.type = js.native

  /**
   * Returns the RGB components as an array
   */
  def toArray(array: js.Array[Double] = js.Array(), offset: Double = 0): js.Array[Double] = js.native

  /**
   * Sets the components of this color from the given buffer attribute
   */
  def fromBufferAttribute(attribute: js.Object, index: Int): this.type = js.native

  /**
   * Returns the hexadecimal value (serialization result)
   */
  def toJSON(): Double = js.native
}

@js.native
@JSGlobal("THREE.Color")
object Color extends js.Object {

  /**
   * A dictionary with X11 color names
   */
  val NAMES: js.Dictionary[Double] = js.native
}
