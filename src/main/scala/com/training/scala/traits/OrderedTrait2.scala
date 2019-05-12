package com.training.scala.traits

object OrderedTrait2 extends App {

  val a = new Rational(1,2)

  val b = new Rational(7,8)

  a > b

  val x = new Rational2(3,4)

  val y = new Rational2(5,6)

  x > y

}

class Rational(val numer: Int, val denom: Int) {
  // ...
  def < (that: Rational) = this.numer * that.denom < that.numer * this.denom
  def > (that: Rational) = that < this
  def <= (that: Rational) = (this < that) || (this == that)
  def >= (that: Rational) = (this > that) || (this == that)
}


class Rational2(val numer: Int, val denom: Int) extends Ordered[Rational2]{

  def compare(that: Rational2) =
    (this.numer * that.denom) - (that.numer * this.denom)

}
