package com.training.scala.ctrlStructures

object Expression5 extends App {

  val x = {
    val intermediate1 = 2 + 3
    val intermediate2 = 4 + 5
    intermediate1 * intermediate2
  }

  println(x)

  val y = if(x>40) true else false

  println(y)



}
