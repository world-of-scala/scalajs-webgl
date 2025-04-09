package THREE

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
@JSImport("three", "Quaternion")
class Quaternion(
  var x: js.UndefOr[Double] = js.undefined,
  var y: js.UndefOr[Double] = js.undefined,
  var z: js.UndefOr[Double] = js.undefined,
  var w: js.UndefOr[Double] = js.undefined
) extends js.Object {

  def set(x: Double, y: Double, z: Double, w: Double): this.type = js.native
}
