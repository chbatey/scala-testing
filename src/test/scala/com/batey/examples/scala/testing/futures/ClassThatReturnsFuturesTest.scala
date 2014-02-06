package com.batey.examples.scala.testing.futures

import org.scalatest.{Matchers, FunSuite}
import scala.concurrent._
import ExecutionContext.Implicits.global
import org.scalatest.concurrent.ScalaFutures

class ClassThatReturnsFuturesTest extends FunSuite with Matchers with ScalaFutures {
  test("Test a asynchronous method synchronously - whenReady") {
    val underTest = new ClassThatReturnsFutures()
    val futureResult = underTest.goDoSomething()

    whenReady(futureResult) { result =>
      result should equal("The result")
    }
  }

  test("Test a asynchronous method synchronously - futureResult") {
    val underTest = new ClassThatReturnsFutures()
    val futureResult = underTest.goDoSomething()

    futureResult.futureValue should equal("The result")
  }
}
