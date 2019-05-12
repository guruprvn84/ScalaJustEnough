package com.training.scala.functions

import java.io.PrintWriter
import java.io.File


object Currying8 extends App {


  def plainOldSum(x: Int, y: Int) = x + y

  def curriedSum(x: Int)(y: Int) = x + y

  curriedSum(1)(2)

  val onePlus = curriedSum(1)_

  onePlus(2)


  /**
    * Writing new control structures
   */

  def twice(op: Double => Double, x: Double) = op(op(x))

  twice(x => x + 1, 5)


  def thrice(op: (Double,Double) => Double, x: Double) = op(op(x,3.0),7)

  val res = thrice((x,y) => x + y, 5)

  println("res"+res)


  def thrice1(op: (Double,Double) => Double, x: Double,y:Double) = op(op(x,y),7)

  val res1 = thrice1((x,y) => x + y, 5,8)

  println("res"+res1)

  /**
    * Another control structure
    */

  def withPrintWriter(file: File, op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  withPrintWriter( new File("date.txt"),
        writer => writer.println(new java.util.Date)
  )





}
