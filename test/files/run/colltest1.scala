/*
 * filter: inliner warnings; re-run with
 */
import scala.collection._
import scala.language.postfixOps

object Test extends App {

  def orderedTraversableTest(empty: Traversable[Int]): Unit = {
    println("new test starting with " + empty)
    assert(empty.isEmpty)
    val ten = empty ++ List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(s"${ten.size}: $ten")
    println(s"${ten.tail.size}: ${ten.tail}")
    assert(ten == empty ++ (1 to 10))
    assert(ten.size == 10)
    assert(ten forall (_ <= 10))
    assert(ten exists (_ == 5))
    assert((ten count (_ % 2 == 0)) == 5)
    assert((ten find (_ % 2 == 0)) == Some(2))
    assert((0 /: ten)(_ + _) == 55)
    assert((ten :\ 0)(_ + _) == 55)
    println(ten.head)
    val x = ten reduceLeft (_ + _)
    assert(x == 55, x)
    assert((ten reduceRight (_ + _)) == 55)
    val firstFive = empty ++ (1 to 5)
    val secondFive = empty ++ (6 to 10)
    assert(firstFive ++ secondFive == ten, firstFive ++ secondFive)
    val odds = ten filter (_ % 2 != 0)
    val evens = ten filterNot (_ % 2 != 0)
    assert(odds.size == evens.size)
    val (o, e) = ten.partition(_ % 2 == 0)
    assert(o.size == e.size)
    val gs = ten groupBy (x => x / 4)
    val vs1 = (for (k <- gs.keysIterator; v <- gs(k).toIterable.iterator)
      yield v).toList.sorted
    val vs2 = gs.values.toList.flatten.sorted
//    val vs2 = gs.values.toList flatMap (xs => xs)
    assert(ten.head == 1)
    assert(ten.tail.head == 2)
    assert(ten.tail.size == 9)
    assert(ten.tail.foldLeft(10)(_ + _) == 64)
    assert(ten.last == 10)
    assert(List(ten.head) ++ ten.tail == ten)
    assert(ten.init ++ List(ten.last) == ten, ten.init)
    assert(vs1 == vs2, s"$vs1!=$vs2")
    assert(vs1 == ten)
    assert((ten take 5) == firstFive)
    assert((ten drop 5) == secondFive)
    assert(ten slice (3, 3) isEmpty)
    assert((ten slice (3, 6)) == List(4, 5, 6), ten slice (3, 6))
    assert((ten takeWhile (_ <= 5)) == firstFive)
    assert((ten dropWhile (_ <= 5)) == secondFive)
    assert((ten span (_ <= 5)) == (firstFive, secondFive))
    assert((ten splitAt 5) == (firstFive, secondFive), ten splitAt 5)
    val buf = new mutable.ArrayBuffer[Int]
    buf ++= firstFive
    buf ++= secondFive
    assert(buf == ten, buf)
    assert(ten.toArray.size == 10)
    assert(ten.toArray.toSeq == ten, ten.toArray.toSeq)
    assert(ten.toIterable == ten)
    assert(ten.toList == ten)
    assert(ten.toSeq == ten)
    assert(ten.toStream == ten)
    assert(ten.toString endsWith "(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)")
    assert(
      ten.mkString("[", "; ", "]") endsWith "[1; 2; 3; 4; 5; 6; 7; 8; 9; 10]")
  }

  def orderedIterableTest(empty: Iterable[Int]): Unit = {
    orderedTraversableTest(empty)
    val six = empty ++ List(1, 2, 3, 4, 5, 6)
    assert(six.iterator.toStream == six)
    assert(six.takeRight(4) == List(3, 4, 5, 6), six.takeRight(4))
    assert(six.dropRight(3) == List(1, 2, 3))
    assert(six sameElements (1 to 6))
  }

  def sequenceTest(empty: Seq[Int]): Unit = {
    orderedIterableTest(empty)
    val ten = empty ++ (1 to 10)
    println(ten)
    val tenPlus = ten map (_ + 1)
    assert((ten zip tenPlus) forall { case (x, y) => x + 1 == y })
    val dble = ten flatMap (x => List(x, x))
    assert(dble.distinct == ten)
    assert(ten.length == 10)
    assert(ten(0) == 1 && ten(9) == 10)
    assert(
      (ten lengthCompare 10) == 0 && (ten lengthCompare 1) > 0 && (ten lengthCompare 11) < 0)
    assert((ten isDefinedAt 0) && (ten isDefinedAt 9))
    assert(!(ten isDefinedAt -1));
    assert(!(ten isDefinedAt 10))
    val tenten = ten zip ten
    assert((tenten map (_._1)) == ten)
    assert((tenten map (_._2)) == ten)
    assert(ten.zipWithIndex forall { case (x, y) => x == y + 1 })
    assert(ten.segmentLength(_ <= 8, 4) == 4, ten.segmentLength(_ <= 8, 4))
    assert(ten.prefixLength(_ <= 8) == 8)
    assert(ten.indexWhere(_ >= 8, 4) == 7, ten.indexWhere(_ >= 8, 4))
    assert(ten.indexWhere(_ >= 8) == 7)
    assert(ten.indexOf(5) == 4)
    assert(ten.indexOf(5, 4) == 4)
    assert(ten.indexOf(5, 5) == -1)
    assert(ten.lastIndexOf(5) == 4, ten.lastIndexOf(5))
    assert(ten.lastIndexOf(5, 4) == 4)
    assert(ten.lastIndexOf(5, 3) == -1)
    assert(ten.lastIndexWhere(_ <= 8) == 7)
    assert(ten.lastIndexWhere(_ <= 8, 6) == 6)
    assert(ten.lastIndexWhere(_ <= 8, 8) == 7)
    assert(ten.reverse startsWith List(10, 9, 8), ten.reverse.take(10).toList)
    assert(ten.reverse.length == 10)
    assert(ten.reverse.reverse == ten)
    assert(ten.reverseIterator.toList.reverse == ten,
           ten.reverseIterator.toList)
    assert(ten.startsWith(List(1)))
    assert(ten.startsWith(List(3, 4), 2))
    assert(ten.endsWith(List(9, 10)))
    assert(ten.endsWith(List()))
    assert(ten.indexOfSlice(List(3, 4, 5)) == 2,
           ten.indexOfSlice(List(3, 4, 5)))
    assert(ten.lastIndexOfSlice(List(8, 9, 10)) == 7)
    assert(ten.lastIndexOfSlice(List(1, 2, 3)) == 0)
    assert(ten.lastIndexOfSlice(List(9, 10, 11)) == -1)
    assert(ten contains 1)
    assert(ten contains 10)
    assert(!(ten contains 0))
    assert(
      (empty ++ (1 to 7) ++ empty ++ (3 to 10)) == List(1, 2, 3, 4, 5, 6, 7, 3,
        4, 5, 6, 7, 8, 9, 10))
    assert((ten diff ten).isEmpty)
    assert((ten diff List()) == ten)
    assert((ten diff (ten filter (_ % 2 == 0))) == (ten filterNot (_ % 2 == 0)))
    assert((ten intersect ten) == ten)
    assert((ten intersect List(5)) == List(5))
    assert((ten ++ ten).distinct == ten)
    assert(ten.patch(3, List(4, 5, 6, 7), 4) == ten)
    assert(ten.patch(0, List(1, 2, 3), 9) == List(1, 2, 3, 10))
    assert(empty.padTo(10, 7) == Array.fill(10)(7).toSeq)
    assert((ten zip ten.indices) == ten.zipWithIndex)
    assert(ten.sortWith(_ < _) == ten)
    assert(ten.sortWith(_ > _) == ten.reverse)
  }

  def setTest(empty: => Set[String]): Unit = {
    var s = empty + "A" + "B" + "C"
    s ++= List("D", "E", "F")
    s ++= List("G", "H", "I")
    s ++= ('J' to 'Z') map (_.toString)
    assert(s forall (s contains))
    assert(s contains "X")
    assert(!(s contains "0"))
    s = s + "0"
    assert(s contains "0")
    s = s.diff(Set("X"))
    assert(!(s contains "X"))
    assert(empty.isEmpty)
    assert(!s.isEmpty)
    assert((s intersect s) == s)
    assert((empty intersect s) == empty)
    assert(!s.isEmpty)
    val s1 = s intersect empty
    assert(s1 == empty, s1)
    def abc = empty ++ Set("a", "b", "c")
    def bc = empty ++ Set("b", "c")
    assert(bc subsetOf abc)
  }

  def rangeTest(r: Range): Unit = {
    val ten = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    assert(r == ten)
    assert(r.toList == ten)
    assert((r filter (_ % 2 == 0)) == (ten filter (_ % 2 == 0)))
    println((r map (_ + 1)) == (ten map (_ + 1)))
    println((r map (_ * 2)) == (ten map (_ + 1)))
    println((r flatMap (i => 0 until i)) == (ten flatMap (i => 0 until i)))
  }

  def mapTest(empty: => Map[String, String]) = {
    var m = empty + ("A" -> "A") + ("B" -> "B") + ("C" -> "C")
    m ++= List(("D" -> "D"), ("E" -> "E"), ("F" -> "F"))
    m ++= List(("G" -> "G"), ("H" -> "H"), ("I" -> "I"))
    m ++= ('J' to 'Z') map (x => (x.toString -> x.toString))
    println(m.toList.sorted)
    assert(!m.isEmpty)
    assert(m.keySet forall (k => (m get k) == Some(k)))
    assert(m.keySet forall (k => (m apply k) == k))
    assert(m.keySet forall (m contains))
    assert(m.getOrElse("7", "@") == "@")
    assert(m.keySet.size == 26)
    assert(m.size == 26)
    assert(m.keySet == Set() ++ m.keysIterator.to(LazyList))
    assert(m.keySet == m.keysIterator.toList.toSet,
           s"${m.keySet.toList}!=${m.keysIterator.toList.toSet}")
    val m1 = empty ++ m
    val ks = m.keySet
    val mm = m.view.filterKeys(k => !ks(k))
    assert(mm.isEmpty, mm)
    def m3 = empty ++ m1
    assert(m1 == m3)
    println(m3.toList.sorted)
    val m4 = m3 filterNot { case (k, v) => k != "A" }
    assert(m4.size == 1, m4)
  }

  def mutableMapTest(empty: => mutable.Map[String, String]) = {
    mapTest(empty)
    val m1 = empty ++ (('A' to 'Z') map (_.toString) map (x => (x, x)))
    val m2 = m1 filterInPlace ((k, v) => k == "N")
    assert(m2.size == 1, m2)
  }

  sequenceTest(Nil)
  sequenceTest(List())
  sequenceTest(Stream.empty)
  sequenceTest(Array[Int]())
  sequenceTest(mutable.ArrayBuffer())
  sequenceTest(mutable.ListBuffer())
  orderedTraversableTest(Traversable())
  orderedTraversableTest(mutable.Traversable())
  orderedTraversableTest(immutable.Traversable())
  orderedIterableTest(Iterable())
  orderedIterableTest(mutable.Iterable())
  orderedIterableTest(immutable.Iterable())
  sequenceTest(Seq())
  sequenceTest(mutable.Seq())
  sequenceTest(immutable.Seq())
  sequenceTest(LinearSeq())
  sequenceTest(IndexedSeq())
  sequenceTest(Vector())
//  sequenceTest(mutable.LinearSeq())
  sequenceTest(immutable.LinearSeq())
  sequenceTest(mutable.IndexedSeq())
  rangeTest(1 to 10)

  setTest(Set())
  setTest(mutable.Set())
  setTest(immutable.Set())
  setTest(mutable.HashSet())
  setTest(mutable.LinkedHashSet())
  setTest(immutable.HashSet())

  mapTest(Map())
  mutableMapTest(mutable.Map())
  mapTest(immutable.Map())
  mapTest(immutable.TreeMap())
  mutableMapTest(mutable.HashMap())
  mutableMapTest(mutable.LinkedHashMap())
  mapTest(immutable.HashMap())
}
