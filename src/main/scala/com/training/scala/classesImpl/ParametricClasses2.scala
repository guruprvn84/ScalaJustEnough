package com.training.scala.classesImpl




class Cat {
  val dangerous = false
}


class Tiger(override val dangerous: Boolean, private var age: Int) extends Cat

