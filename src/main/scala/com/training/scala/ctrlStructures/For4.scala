package com.training.scala.ctrlStructures

object For4 extends App {

  val data = for(
                x <- Vector(1,2,3,4,5);
                    if x % 2 == 1;
                      y <- Set(1,2,3);
                        if x + y == 6
                ) yield (x,y)

  println(data)
}
