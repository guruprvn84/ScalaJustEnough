package com.training.scala.functions

import scala.io.Source

object MethodFindLongLines1 extends App {


  val width = args(0).toInt
  for (arg <- args.drop(1))
    LongLines.processFile(arg, width)

}
class SimpleClass{

}
class LongLines{

}
object LongLines {

      def processFile(filename: String, width: Int) {
            val source = Source.fromFile(filename)
            for (line <- source.getLines)
              processLine(filename, width, line)
      }

      private def processLine(filename: String,width: Int, line: String) {

          if (line.length > width)
              println(filename +": "+ line.trim)
      }

}