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

package scala.tools.nsc.profile

import scala.tools.nsc.{Phase, Settings}

/**
  * Specifies a plugin to the profiler.
  * This is generated via the ServiceLoader. See [[java.util.ServiceLoader]] javadoc for configuration information
  *
  * Note: this must generate a java interface only
  */
trait ProfilerPlugin {

  /**
    * Generate a run specific profiler
    *
    * @param profiler the currently enabled profiler
    * @param settings the setting for the current compile
    * @return the run specific profiler, that will receive updates as the compile progresses
    */
  def generate(profiler: RealProfiler, settings: Settings): ProfilerPluginRun
}

/**
  * Generated by [[ProfilerPlugin]], the plugin information for a single run of the compiler
  */
trait ProfilerPluginRun {

  /** called before a phase */
  def beforePhase(phase: Phase): Unit

  /** called afer a phase a phase */
  def afterPhase(phase: Phase): Unit

  /** called when the compile run completes */
  def finished(): Unit

}
