package com.training.scala.ctrlStructures

object For3 extends App {

  for(
        x <- Vector(1,2,3,4,5);
        if x % 2 == 1;
        y <- Set(1,2,3);
        if x + y == 6

     )
      println(s"x=$x, y=$y")

}
