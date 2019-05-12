package com.training.scala.functions


import scala.io.Source

object LocalFunctions2 extends App {

  val width = args(0).toInt

  for (arg <- args.drop(1))
      processFile(arg, width)



  def processFile(filename: String, width: Int) {

    def processLine(filename: String,
                    width: Int, line: String) {
      if (line.length > width)
        print(filename +": "+ line)
    }

    val source = Source.fromFile(filename)

    for (line <- source.getLines) {
      processLine(filename, width, line)
    }
  }




}
