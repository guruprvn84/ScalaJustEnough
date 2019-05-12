package com.training.scala

import scala.collection.mutable.ListBuffer
import scala.io.Source

object Anagrams extends App {

  val file = "resources/SimpleInput"

  Source.fromFile(file).getLines()

 /* val sortedList:List[String] = Source.fromFile(file).getLines().flatMap(line => line.toLowerCase().split(" ").toList).map(x => x.sortWith(_ < _)).toList

  val anagramsList = sortedList.map(x => (x,1)).groupBy(_._1).mapValues(seq => seq.reduce{(x,y) => (x._1, x._2+y._2)}).map(x => x._2)

  anagramsList.foreach(println)
  */

  val res1 = Source.fromFile(file).getLines().flatMap(line => line.toLowerCase().split(" ").toList)

  val sortedList = res1.map(x => x.sortWith(_ < _)).toList

  val groupedList = sortedList.map(x => (x,1)).groupBy(_._1)

  //(("abc",Seq(("abc",1), ("abc",1), ("abc",1))
  //,("bcd",Seq(("bcd",1))
  // )

  //groupedList.foreach(println)

  val anagramsList = groupedList.mapValues(seq => seq.reduce{(x,y) => (x._1, x._2+y._2)}).map(x => x._2)

  anagramsList.foreach(println)

}










































