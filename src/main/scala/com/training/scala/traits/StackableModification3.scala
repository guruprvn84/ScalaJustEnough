package com.training.scala.traits

import scala.collection.mutable.ArrayBuffer

object StackableModification3 extends App {

  val queue = new BasicIntQueue

  queue.put(10)
  queue.put(11)
  queue.put(12)

  println(queue.get())
  println(queue.get())
  println(queue.get())

  val doublingQueue = new BasicIntQueue with Doubling

  doublingQueue.put(10)
  doublingQueue.put(20)
  doublingQueue.put(30)

  println(doublingQueue.get())
  println(doublingQueue.get())
  println(doublingQueue.get())

  val doubleIncreFilterQueue = new BasicIntQueue with Doubling with Incrementing with Filtering

  doubleIncreFilterQueue.put(10)
  doubleIncreFilterQueue.put(20)
  doubleIncreFilterQueue.put(-10)

  println(doubleIncreFilterQueue.get())
  println(doubleIncreFilterQueue.get())
  println(doubleIncreFilterQueue.get())


}

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}


trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x + 1) }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  } }
