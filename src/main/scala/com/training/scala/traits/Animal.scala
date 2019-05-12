package com.training.scala.traits



trait AnimalRunnable{
  def runNow(): Unit ={
    println("i can run")
  }
}

class Fish extends AnimalRunnable{
  override def toString = "green"
}

trait HasLegs

class Frog extends AnimalRunnable with HasLegs{
  override def toString = "brown"
  override def runNow() {
    println("i can jump as well")
  }
}


object Animal extends App {

  val obj:AnimalRunnable = new Fish with HasLegs

  println(obj.toString)

  val obj1:HasLegs = new Frog

  println(obj1.toString)


}
