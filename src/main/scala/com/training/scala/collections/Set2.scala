package com.training.scala.collections

import scala.collection.mutable

object Set2 extends App {

  val text = "See Spot run. Run, Spot. Run!"

  val wordsArray = text.split("[ !,.]+")

  val words = mutable.Set.empty[String]

  for (word <- wordsArray){

      words += word.toLowerCase()

  }

  println(words)


}
