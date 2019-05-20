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

@FunctionalInterface trait JFunction2$mcFJJ$sp
    extends Function2[Any, Any, Any]
    with Serializable {
  def apply$mcFJJ$sp(v1: Long, v2: Long): Float
  override def apply(v1: Any, v2: Any): Any =
    scala.runtime.BoxesRunTime.boxToFloat(
      apply$mcFJJ$sp(scala.runtime.BoxesRunTime.unboxToLong(v1),
                     scala.runtime.BoxesRunTime.unboxToLong(v2)))
}
