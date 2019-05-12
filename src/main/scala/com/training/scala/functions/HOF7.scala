package com.training.scala.functions

object HOF7 extends App {

  val list = List(1,2,3)

  def doubleValue = (x: Int) => x * x

  val doubledList = list.map(x => doubleValue(x))

  println(doubledList)

}
