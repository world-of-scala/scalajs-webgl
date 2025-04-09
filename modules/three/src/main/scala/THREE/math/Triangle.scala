package THREE

import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * A class representing a triangle in 3D space.
 */
@js.native
@JSImport("three", "Triangle")
class Triangle(
  var a: js.UndefOr[Vector3] = js.undefined,
  var b: js.UndefOr[Vector3] = js.undefined,
  var c: js.UndefOr[Vector3] = js.undefined
) extends js.Object {

  def set(a: Vector3, b: Vector3, c: Vector3): this.type                                       = js.native
  def setFromPointsAndIndices(points: js.Array[Vector3], i0: Int, i1: Int, i2: Int): this.type = js.native

  @JSName("clone")
  def jsClone(): Triangle                 = js.native
  def copy(triangle: Triangle): this.type = js.native

  def getArea(): Double                                                                                   = js.native
  def getMidpoint(target: Vector3): Vector3                                                               = js.native
  def getNormal(target: Vector3): Vector3                                                                 = js.native
  def getPlane(target: Plane): Plane                                                                      = js.native
  def getBarycoord(point: Vector3, target: Vector3): Vector3                                              = js.native
  def getUV(point: Vector3, uv1: js.Object, uv2: js.Object, uv3: js.Object, target: js.Object): js.Object = js.native

  def containsPoint(point: Vector3): Boolean = js.native
  def intersectsBox(box: Box3): Boolean      = js.native

  def equals(triangle: Triangle): Boolean = js.native
}

@js.native
@JSImport("three", "Triangle")
object Triangle extends js.Object {
  def getNormal(a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3                    = js.native
  def getBarycoord(point: Vector3, a: Vector3, b: Vector3, c: Vector3, target: Vector3): Vector3 = js.native
  def containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3): Boolean                 = js.native
  def getUV(
    point: Vector3,
    p1: Vector3,
    p2: Vector3,
    p3: Vector3,
    uv1: js.Object,
    uv2: js.Object,
    uv3: js.Object,
    target: js.Object
  ): js.Object = js.native
}
