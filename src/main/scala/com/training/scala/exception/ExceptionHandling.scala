package com.training.scala.exception

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import scala.io.Source

object ExceptionHandling extends App {

  val file = Source.fromFile("resources/SimpleInput")

  try {
      file.getLines()

  } catch {
    case ex: FileNotFoundException => // Handle missing file
    case ex: IOException => // Handle other I/O error
  }finally {
    file.close()  // Be sure to close the file
  }
}


