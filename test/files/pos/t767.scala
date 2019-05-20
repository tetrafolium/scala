abstract class AbsCell {
  type T = Node
  val init: T
  private var value: T = init
  def get: T = value
  def set(x: T): Unit = { value = x }

  class Node {
    val foo = 1
  }
}

object inner {
  def main(args: Array[String]): Unit = {
    val cell = new AbsCell { val init = new Node() }
    cell.set(new cell.type#T()) // nullpointer exception
  }
}
