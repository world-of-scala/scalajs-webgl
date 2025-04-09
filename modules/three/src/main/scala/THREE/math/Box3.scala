package THREE

import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * Represents an axis-aligned bounding box (AABB) in 3D space.
 */
@js.native
@JSGlobal("THREE.Box3")
class Box3(val min: js.UndefOr[Vector3] = js.undefined, val max: js.UndefOr[Vector3] = js.undefined) extends js.Object {

  /** Flag that can be used for type testing. */
  val isBox3: Boolean = js.native

  /** Sets the lower and upper boundaries of this box. */
  def set(min: Vector3, max: Vector3): this.type = js.native

  /** Sets box bounds to enclose all positions in the given array. */
  def setFromArray(array: js.Array[Double]): this.type = js.native

  /** Sets box bounds from the given buffer attribute. */
  def setFromBufferAttribute(attribute: js.Object): this.type = js.native

  /** Sets box bounds to enclose all points in the array. */
  def setFromPoints(points: js.Array[Vector3]): this.type = js.native

  /** Centers this box on the given center vector with the given size. */
  def setFromCenterAndSize(center: Vector3, size: Vector3): this.type = js.native

  /** Sets box bounds from the given 3D object. */
  def setFromObject(obj: js.Object, precise: Boolean = false): this.type = js.native

  /** Returns a clone of this box. */
  @JSName("clone")
  def jsClone(): Box3 = js.native

  /** Copies values from another box. */
  def copy(box: Box3): this.type = js.native

  /** Makes this box empty. */
  def makeEmpty(): this.type = js.native

  /** Checks if this box is empty. */
  def isEmpty(): Boolean = js.native

  /** Returns the center point of this box. */
  def getCenter(target: Vector3): Vector3 = js.native

  /** Returns the dimensions of this box. */
  def getSize(target: Vector3): Vector3 = js.native

  /** Expands box to include the given point. */
  def expandByPoint(point: Vector3): this.type = js.native

  /** Expands box equilaterally by the given vector. */
  def expandByVector(vector: Vector3): this.type = js.native

  /** Expands box by scalar amount. */
  def expandByScalar(scalar: Double): this.type = js.native

  /** Expands box to include the given object and its children. */
  def expandByObject(obj: js.Object, precise: Boolean = false): this.type = js.native

  /** Tests if point is inside box. */
  def containsPoint(point: Vector3): Boolean = js.native

  /** Tests if box contains another box entirely. */
  def containsBox(box: Box3): Boolean = js.native

  /** Returns point as a proportion of box's dimensions. */
  def getParameter(point: Vector3, target: Vector3): Vector3 = js.native

  /** Tests if box intersects with another box. */
  def intersectsBox(box: Box3): Boolean = js.native

  /** Tests if box intersects with a sphere. */
  def intersectsSphere(sphere: js.Object): Boolean = js.native

  /** Tests if box intersects with a plane. */
  def intersectsPlane(plane: js.Object): Boolean = js.native

  /** Tests if box intersects with a triangle. */
  def intersectsTriangle(triangle: js.Object): Boolean = js.native

  /** Clamps a point within box bounds. */
  def clampPoint(point: Vector3, target: Vector3): Vector3 = js.native

  /** Returns distance from box edge to point. */
  def distanceToPoint(point: Vector3): Double = js.native

  /** Returns a bounding sphere enclosing this box. */
  def getBoundingSphere(target: js.Object): js.Object = js.native

  /** Computes intersection with another box. */
  def intersect(box: Box3): this.type = js.native

  /** Computes union with another box. */
  def union(box: Box3): this.type = js.native

  /** Transforms box by 4x4 matrix. */
  def applyMatrix4(matrix: js.Object): this.type = js.native

  /** Translates box by offset vector. */
  def translate(offset: Vector3): this.type = js.native

  /** Tests equality with another box. */
  def equals(box: Box3): Boolean = js.native
}
