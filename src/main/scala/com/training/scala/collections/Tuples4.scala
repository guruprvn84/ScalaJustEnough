package com.training.scala.collections

object Tuples4 extends App {

  def longestWord(words: Array[String]) = {
    var word = words(0)
    var idx = 0
    for (i <- 1 until words.length)
      if (words(i).length > word.length) {
        word = words(i)
        idx = i
      }
    (word, idx)
  }


  val longest = longestWord("Hi welcome to scala session".split(" "))

  println(longest._1)

  println(longest._2)

  val map = Map("hi" -> 1, "hello"->2,"hi"->3)


}
