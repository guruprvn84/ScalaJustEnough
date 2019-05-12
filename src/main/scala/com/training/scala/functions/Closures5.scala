package com.training.scala.functions

object Closures5 extends App {

  (x: Int) => x + 1

  var more = 1

  val addMore = (x:Int)=> x + more


  /*
  Changes made by a closure to a captured variable are visible outside the closure
   */

  val someNumbers = List(-11, -10, -5, 0, 5, 10)

  var sum = 0

  someNumbers.foreach(sum +=  _)

  println(sum)





}
