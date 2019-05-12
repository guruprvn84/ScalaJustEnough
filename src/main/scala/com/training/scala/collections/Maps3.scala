package com.training.scala.collections


import scala.collection.immutable.Map

object Maps3 extends App {

  val nums = Map("first" -> 1, "second" -> 2)

  nums + ("third" -> 3)

  nums - "third"

  nums ++ Map("fourth"->4,"fifth"->5)

  nums -- List("first","second")

  val mutableNums = scala.collection.mutable.Map("first" -> 1, "second" -> 2)

  mutableNums += ("third" -> 3)

  mutableNums -= "third"

  mutableNums ++= Map("fourth"->4,"fifth"->5)

  mutableNums --= List("fourth","fifth")

  val toMutableNums = scala.collection.mutable.Map.empty ++ nums

  println(toMutableNums.getClass)

  val toImmuNums = Map.empty ++ mutableNums

  println(toImmuNums.getClass)



}
