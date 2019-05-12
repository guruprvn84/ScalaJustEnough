package com.training.scala.patMatch

object PatternMatching2 extends App {

  var x = 5

  //Constant

  val res = x match {
    case 5 => "five"
    case _ => "something else"
  }

  println(res)

  //variable
  x = 10

  println(
    x match {
    case 5 => "five"
    case somethingelse => "something else " +somethingelse
  })


  val message = Message("sender1","receipient1","message1")

  //constructor

  val res1 = message match {
    case Message("sender2","receipient1","message1") => println("sender2 found")
    case Message("sender1","receipient1","message1") => println("a deep match")
    case a: Message => println("top level match")

  }

  //Sequence

  val list = List(1,2,4,5,5)

  list match  {
    case List(0,_*) => println("Matches any list that starts with zero")
    case List(_,_,_,_,_) => println("Matches list of length 5")
    case List(_*) => println("matches everything")
  }

  //Typed patterns + type erasure
  val obj:Any = Map(1->2,2->3)

  obj match {

    case s:String => println("String size " +s.length)
    case m:Map[_,_] => println("map size " + m.size)
    case m:Map[Int,Double] => println("Map int double "+m.size)
  }

  //variable binding

  val res2 = message match {
    case Message("sender2","receipient1","message1") => println("sender2 found")
    case Message("sender1",e @ "receipient1","message1") => println("a deep match " +  e)
    case a: Message => println("top level match")
  }

  //Pattern guards

  val res3 = message match {
    case Message("sender1",e @ "receipient1","message1") if(e.equals("receipient112")) => println("a deep match " +  e)
    case Message("sender2","receipient1","message1") => println("sender2 found")
    case a: Message => println("top level match")
  }

}
