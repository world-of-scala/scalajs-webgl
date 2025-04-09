package THREE

import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * A collection of math utility functions.
 */
@js.native
@JSImport("three", "MathUtils")
object MathUtils extends js.Object {

  /** Constant to convert degrees to radians */
  val DEG2RAD: Double = js.native

  /** Constant to convert radians to degrees */
  val RAD2DEG: Double = js.native

  /**
   * Generate a UUID (universally unique identifier).
   */
  def generateUUID(): String = js.native

  /**
   * Clamps the given value between min and max.
   */
  def clamp(value: Double, min: Double, max: Double): Double = js.native

  /**
   * Computes the Euclidean modulo of the given parameters: ((n % m) + m) % m
   */
  def euclideanModulo(n: Double, m: Double): Double = js.native

  /**
   * Performs a linear mapping from range <a1, a2> to range <b1, b2> for the
   * given value.
   */
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double = js.native

  /**
   * Returns the percentage in the closed interval [0, 1] of the given value
   * between the start and end point.
   */
  def inverseLerp(x: Double, y: Double, value: Double): Double = js.native

  /**
   * Returns a value linearly interpolated from two known points. t = 0 returns
   * x and t = 1 returns y.
   */
  def lerp(x: Double, y: Double, t: Double): Double = js.native

  /**
   * Smoothly interpolate a number from x to y in a spring-like manner.
   */
  def damp(x: Double, y: Double, lambda: Double, dt: Double): Double = js.native

  /**
   * Returns a value that alternates between 0 and the given length parameter.
   */
  def pingpong(x: Double, length: Double = 1): Double = js.native

  /**
   * Returns a value in the range [0,1] that represents the percentage that x
   * has moved between min and max, but smoothed or slowed down the closer x is
   * to the min and max.
   */
  def smoothstep(x: Double, min: Double, max: Double): Double = js.native

  /**
   * A variation on smoothstep that has zero 1st and 2nd order derivatives at
   * x=0 and x=1.
   */
  def smootherstep(x: Double, min: Double, max: Double): Double = js.native

  /**
   * Returns a random integer from <low, high> interval.
   */
  def randInt(low: Double, high: Double): Double = js.native

  /**
   * Returns a random float from <low, high> interval.
   */
  def randFloat(low: Double, high: Double): Double = js.native

  /**
   * Returns a random float from <-range/2, range/2> interval.
   */
  def randFloatSpread(range: Double): Double = js.native

  /**
   * Returns a deterministic pseudo-random float in the interval [0, 1].
   */
  def seededRandom(s: js.UndefOr[Double] = js.undefined): Double = js.native

  /**
   * Converts degrees to radians.
   */
  def degToRad(degrees: Double): Double = js.native

  /**
   * Converts radians to degrees.
   */
  def radToDeg(radians: Double): Double = js.native

  /**
   * Returns true if the given number is a power of two.
   */
  def isPowerOfTwo(value: Double): Boolean = js.native

  /**
   * Returns the smallest power of two that is greater than or equal to the
   * given number.
   */
  def ceilPowerOfTwo(value: Double): Double = js.native

  /**
   * Returns the largest power of two that is less than or equal to the given
   * number.
   */
  def floorPowerOfTwo(value: Double): Double = js.native

  /**
   * Sets the given quaternion from the Intrinsic Proper Euler Angles.
   */
  def setQuaternionFromProperEuler(q: Quaternion, a: Double, b: Double, c: Double, order: String): Unit = js.native

  /**
   * Normalizes the given value according to the given typed array.
   */
  def normalize(value: Double, array: js.typedarray.TypedArray[?, ?]): Double = js.native

  /**
   * Denormalizes the given value according to the given typed array.
   */
  def denormalize(value: Double, array: js.typedarray.TypedArray[?, ?]): Double = js.native
}

/**
 * Constants and functions from MathUtils available as top-level exports
 */
@js.native
@JSGlobal("THREE")
object MathUtilsConstants extends js.Object {

  /** Constant to convert degrees to radians */
  val DEG2RAD: Double = js.native

  /** Constant to convert radians to degrees */
  val RAD2DEG: Double = js.native
}

@js.native
@JSGlobal("THREE")
object MathUtilsFunctions extends js.Object {
  def generateUUID(): String                                                                            = js.native
  def clamp(value: Double, min: Double, max: Double): Double                                            = js.native
  def euclideanModulo(n: Double, m: Double): Double                                                     = js.native
  def mapLinear(x: Double, a1: Double, a2: Double, b1: Double, b2: Double): Double                      = js.native
  def inverseLerp(x: Double, y: Double, value: Double): Double                                          = js.native
  def lerp(x: Double, y: Double, t: Double): Double                                                     = js.native
  def damp(x: Double, y: Double, lambda: Double, dt: Double): Double                                    = js.native
  def pingpong(x: Double, length: Double = 1): Double                                                   = js.native
  def smoothstep(x: Double, min: Double, max: Double): Double                                           = js.native
  def smootherstep(x: Double, min: Double, max: Double): Double                                         = js.native
  def randInt(low: Double, high: Double): Double                                                        = js.native
  def randFloat(low: Double, high: Double): Double                                                      = js.native
  def randFloatSpread(range: Double): Double                                                            = js.native
  def seededRandom(s: js.UndefOr[Double] = js.undefined): Double                                        = js.native
  def degToRad(degrees: Double): Double                                                                 = js.native
  def radToDeg(radians: Double): Double                                                                 = js.native
  def isPowerOfTwo(value: Double): Boolean                                                              = js.native
  def ceilPowerOfTwo(value: Double): Double                                                             = js.native
  def floorPowerOfTwo(value: Double): Double                                                            = js.native
  def setQuaternionFromProperEuler(q: Quaternion, a: Double, b: Double, c: Double, order: String): Unit = js.native
  def normalize(value: Double, array: js.typedarray.TypedArray[?, ?]): Double                           = js.native
  def denormalize(value: Double, array: js.typedarray.TypedArray[?, ?]): Double                         = js.native
}
