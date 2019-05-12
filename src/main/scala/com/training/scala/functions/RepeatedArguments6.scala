package com.training.scala.functions

object RepeatedArguments6 extends App {

  def echo(args: String*) =
    for (arg <- args)
        println(arg)

  echo()

  echo("one")

  echo("hello", "world!")

  val arr = Array("What's", "up", "doc?")

  echo(arr: _*)

}
