package com.training.scala.langfundamentals

import apple.laf.JRSUIConstants.NothingToScroll

import scala.runtime.{RichByte, RichInt}

object Types2 extends App {

    // Rich Wrappers


    println(0 max 5)

    println(0 min 5)

    println(-2.7 abs)

    println(-2.7 round)

    println(4 to 6)

    println("hello" capitalize)

    println("welcome" drop 3)


  /**
    * Null, null, Nil, Nothing, None, Unit
    */

    val b = null

    val c = Nil

    println(c)

    //val d = Nothing

    val e = Option(null)

    e match {
      case Some(x) => print(x)

      case None => print("Its null")
    }





}
