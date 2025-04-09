package THREE

import scala.scalajs.js
import scala.scalajs.js.annotation._

/**
 * Represents an axis-aligned bounding box (AABB) in 2D space.
 */
@js.native
@JSImport("three", "Box2")
class Box2(val min: js.UndefOr[Vector2] = js.undefined, val max: js.UndefOr[Vector2] = js.undefined) extends js.Object {

  /**
   * This flag can be used for type testing.
   */
  val isBox2: Boolean = js.native

  /**
   * Sets the lower and upper boundaries of this box. Please note that this
   * method only copies the values from the given objects.
   */
  def set(min: Vector2, max: Vector2): this.type = js.native

  /**
   * Sets the upper and lower bounds of this box so it encloses the position
   * data in the given array.
   */
  def setFromPoints(points: js.Array[Vector2]): this.type = js.native

  /**
   * Centers this box on the given center vector and sets this box's width and
   * height to the given size values.
   */
  def setFromCenterAndSize(center: Vector2, size: Vector2): this.type = js.native

  /**
   * Returns a new box with copied values from this instance.
   */
  @JSName("clone")
  def jsClone(): Box2 = js.native

  /**
   * Copies the values of the given box to this instance.
   */
  def copy(box: Box2): this.type = js.native

  /**
   * Makes this box empty which means in encloses a zero space in 2D.
   */
  def makeEmpty(): this.type = js.native

  /**
   * Returns true if this box includes zero points within its bounds.
   */
  def isEmpty(): Boolean = js.native

  /**
   * Returns the center point of this box.
   */
  def getCenter(target: Vector2): Vector2 = js.native

  /**
   * Returns the dimensions of this box.
   */
  def getSize(target: Vector2): Vector2 = js.native

  /**
   * Expands the boundaries of this box to include the given point.
   */
  def expandByPoint(point: Vector2): this.type = js.native

  /**
   * Expands this box equilaterally by the given vector.
   */
  def expandByVector(vector: Vector2): this.type = js.native

  /**
   * Expands each dimension of the box by the given scalar.
   */
  def expandByScalar(scalar: Double): this.type = js.native

  /**
   * Returns `true` if the given point lies within or on the boundaries of this
   * box.
   */
  def containsPoint(point: Vector2): Boolean = js.native

  /**
   * Returns `true` if this bounding box includes the entirety of the given
   * bounding box.
   */
  def containsBox(box: Box2): Boolean = js.native

  /**
   * Returns a point as a proportion of this box's width and height.
   */
  def getParameter(point: Vector2, target: Vector2): Vector2 = js.native

  /**
   * Returns `true` if the given bounding box intersects with this bounding box.
   */
  def intersectsBox(box: Box2): Boolean = js.native

  /**
   * Clamps the given point within the bounds of this box.
   */
  def clampPoint(point: Vector2, target: Vector2): Vector2 = js.native

  /**
   * Returns the euclidean distance from any edge of this box to the specified
   * point.
   */
  def distanceToPoint(point: Vector2): Double = js.native

  /**
   * Computes the intersection of this bounding box and the given one.
   */
  def intersect(box: Box2): this.type = js.native

  /**
   * Computes the union of this box and another and the given one.
   */
  def union(box: Box2): this.type = js.native

  /**
   * Adds the given offset to both the upper and lower bounds of this bounding
   * box.
   */
  def translate(offset: Vector2): this.type = js.native

  /**
   * Returns `true` if this bounding box is equal with the given one.
   */
  def equals(box: Box2): Boolean = js.native
}
