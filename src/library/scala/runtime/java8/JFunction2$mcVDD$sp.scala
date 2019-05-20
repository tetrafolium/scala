/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc.
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.runtime.java8

@FunctionalInterface trait JFunction2$mcVDD$sp
    extends Function2[Any, Any, Any]
    with Serializable {
  def apply$mcVDD$sp(v1: Double, v2: Double): Unit
  override def apply(v1: Any, v2: Any): Any = {
    apply$mcVDD$sp(scala.runtime.BoxesRunTime.unboxToDouble(v1),
                   scala.runtime.BoxesRunTime.unboxToDouble(v2))
    scala.runtime.BoxedUnit.UNIT
  }
}
