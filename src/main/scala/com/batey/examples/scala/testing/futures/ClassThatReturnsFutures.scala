package com.batey.examples.scala.testing.futures

import scala.concurrent._
import ExecutionContext.Implicits.global

class ClassThatReturnsFutures() {
  def goDoSomething() : Future[String] = {
    future {
      println("I best do this asynchronously")
      "The result"
    }
  }
}
