package com.training.scala.classesImpl

object Hierarchy5 extends App {


    /* Any
         final def ==(that: Any): Boolean
         final def !=(that: Any): Boolean
         def equals(that: Any): Boolean
         def hashCode: Int
         def toString: String
     */

  val x = "abcd".substring(2)

  val y = "abcd".substring(2)

  println(x == y)


    /* AnyRef
        eq
        ne
     */

  val x1 = new String("abc")

  val y1 = new String("abc")

  println(x1 == y1)

  println(x1 eq y1)

  println(x1 ne y1)
}

class Hierarchy6{

  private var a:String=""

  def setA(b:String)= {
    a = b
  }





}
