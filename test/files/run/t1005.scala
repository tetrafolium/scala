import scala.language.postfixOps
object Test {
  class Foo[T](x: Array[AnyRef]) { def bar = x.asInstanceOf[Array[T]] }
  class Bar[T](x: Array[T]) { def bar = x.asInstanceOf[Array[AnyRef]] }

  object FromMono {
    def mainer(args: Array[String]) =
      (new Foo[AnyRef](Array[AnyRef]("Help!"))).bar
  }

  object FromPoly {
    def mainer(args: Array[String]) =
      (new Bar[AnyRef](Array[AnyRef]("Help!"))).bar
  }

  def main(args: Array[String]): Unit = {
    println(FromMono mainer null mkString)
    println(FromPoly mainer null mkString)
  }
}
