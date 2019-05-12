package com.training.scala.functions

object PartiallyAppliedFunc4 extends App {

      def sum(a: Int, b: Int, c: Int) = a + b + c

      println(sum(1,2,3))

      val a = sum _

      a(1,2,3)

      val b = sum(1, _: Int, 3)

}
