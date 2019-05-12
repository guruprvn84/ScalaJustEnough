package com.training.scala.functions

object FunctionLiterals3 extends App {

  (x: Int) => x + 1

  val increase = (x: Int) => x + 1

  println(increase(10))

  var increment = (x: Int) => {
    println("We")
    println("are in Scala training")
    x+1
  }

  println(increment(10))




  /**
    * LIBRARIES
    */


    val someNumbers = List(-11, -10, -5, 0, 5, 10)

    someNumbers.foreach((x: Int) => println(x))

    println("----------")

    val res = someNumbers.filter((x: Int) => x > 0)

    res.foreach(println)

    println("----------")

    someNumbers.filter((x) => x > 0) //Target typing

    println("-----------")

    someNumbers.filter(x => x > 0)

    println("-----------")

    someNumbers.filter(_ > 0) //Placeholder syntax


}
