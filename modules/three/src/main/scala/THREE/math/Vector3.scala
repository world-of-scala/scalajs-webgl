package THREE

import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * Class representing a 3D vector.
 */
@js.native
@JSGlobal("THREE.Vector3")
class Vector3(
  val x: js.UndefOr[Double] = js.undefined,
  val y: js.UndefOr[Double] = js.undefined,
  val z: js.UndefOr[Double] = js.undefined
) extends js.Object {

  def copy(v: Vector3): this.type                                      = js.native
  def add(v: Vector3): this.type                                       = js.native
  def sub(v: Vector3): this.type                                       = js.native
  def addScalar(s: Double): this.type                                  = js.native
  def min(v: Vector3): this.type                                       = js.native
  def max(v: Vector3): this.type                                       = js.native
  def multiplyScalar(scalar: Double): this.type                        = js.native
  def clamp(min: Vector3, max: Vector3): this.type                     = js.native
  def distanceTo(v: Vector3): Double                                   = js.native
  def distanceToSquared(v: Vector3): Double                            = js.native
  def equals(v: Vector3): Boolean                                      = js.native
  def set(x: Double, y: Double, z: Double): this.type                  = js.native
  def addVectors(a: Vector3, b: Vector3): this.type                    = js.native
  def subVectors(a: Vector3, b: Vector3): this.type                    = js.native
  def applyMatrix4(m: js.Object): this.type                            = js.native
  def dot(v: Vector3): Double                                          = js.native
  def length(): Double                                                 = js.native
  def fromArray(array: js.Array[Double], offset: Int = 0): this.type   = js.native
  def fromBufferAttribute(attribute: js.Object, index: Int): this.type = js.native
}
