package com.training.scala.classesImpl

object Polymorphic4 extends App {

  val obj = new UniformElement
  obj.invokeDemo(new ArrayElementobj)

}
abstract class Elementobj {
  def demo() {
    println("Element's implementation invoked")
  }
}
class ArrayElementobj extends Elementobj {
  override def demo() {
    println("ArrayElement's implementation invoked")
  }
}
class LineElementobj extends ArrayElementobj {
  override def demo() {
    println("LineElement's implementation invoked")
  }
}

class UniformElement extends Elementobj{

  def invokeDemo(e: Elementobj) {
    e.demo()
  }

}
