import java.io.{
  ByteArrayInputStream,
  ByteArrayOutputStream,
  ObjectInputStream,
  ObjectOutputStream
}

object Test {
  val lambdas: List[Any => String] = List(
    { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }, { (t: Any) =>
      "ab"
    }
  )

  def main(args: Array[String]): Unit = {
    for (lambda <- lambdas) {
      val outStream = new ByteArrayOutputStream
      val oo = new ObjectOutputStream(outStream)
      oo.writeObject(lambda)

      val inStream = new ByteArrayInputStream(outStream.toByteArray)
      val oi = new ObjectInputStream(inStream)
      val lambda2 = oi.readObject().asInstanceOf[Any => String]
      assert(lambda2(1) == "ab")
    }
  }
}
