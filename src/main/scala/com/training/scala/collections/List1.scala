package com.training.scala.collections

object List1 extends App {

  val nums: List[Int] = List(1, 2, 3, 4)

  val diag3: List[List[Int]] =
    List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )

  val empty: List[Nothing] = List()

  //Construction - Nil and ::

  val diag4 = (1 :: (0 :: (0 :: Nil))) ::
    (0 :: (1 :: (0 :: Nil))) ::
    (0 :: (0 :: (1 :: Nil))) :: Nil

  //Basic operations

  val fruit = "apples" :: "oranges" :: "pears" :: Nil

  println(fruit.head)
  println(fruit.tail)
  println(fruit.isEmpty)

  println(fruit.tail.head)


  //deconstruction

  val a :: b :: end  = fruit

  println(a)
  println(b)
  println(end)


  //concatenation

  var finalList = List(1,2) ::: List(3,4)

  println(finalList)

  finalList = append(List(1,2),List(3,4))

  println(finalList)


  //append implementation

  def append[T](xs: List[T], ys: List[T]): List[T] =
    xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }

  // init and last

  println(finalList.init)

  println(finalList.last)


  //reverse a list - try custom one

  println(finalList.reverse)


  //drop, take, splitAt

  println(finalList.take(2))

  println(finalList.drop(2))

  val res4 = finalList.splitAt(1)

  println(res4._1)
  println(res4._2)


  //indices

  println(finalList.indices)

  val indexedList =  finalList.indices zip finalList

  println(indexedList)

  println(finalList.zipWithIndex)

  //Higher order methods

  println(List(1,2,3).map(_ + 1))

  val words = List("hi","welcome","to","scala","session")

  val wordsList = words map (_.toList)

  val wordsList2 = words.map(_.toList)

  println(wordsList)

  println(wordsList flatMap (_.toList))

  val numbers = List(1,2,3,4,5,6)

  println(numbers.filter(_%2 == 0))

  val partitioned = numbers.partition(_%2 == 0)

  println(partitioned._1)
  println(partitioned._2)

  println(numbers.takeWhile(_ < 5))

  println(numbers.dropWhile(_ < 3))

  //Folding

  println(numbers.foldLeft(0)(_+_))

  println(numbers.foldLeft(1)(_*_))

  println(numbers.foldRight(0)(_+_))

  println(numbers.foldRight(1)(_+_))

  //try custom reverse using fold


  nums.par




}

