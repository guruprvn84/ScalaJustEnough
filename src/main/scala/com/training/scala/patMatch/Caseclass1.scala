package com.training.scala.patMatch

object Caseclass1 extends App {

  val message1 = Message("sender1","receipient1","message1")

  val message2 = Message("sender1","receipient1","message1")

  println(message1 == message2)

  val message3 = Message("sender3","receipient3","message3")

  println(message1 == message3)

  message1.equals(message2)

  message1.toString

  message1.hashCode()

  val Message(sName,rName,mess) = message1

  println(sName)

  println(rName)

  println(mess)

  val list = List(1,2,3,4,5)

  list(0)

  val arr = Array(1,2,3,4)

  arr(0)
}



case class Message(sender: String, recipient: String, body: String) //public + val




/*
    object Message{
      def apply(sender: String, recipient: String, body: String):Message = new Message(sender,recipient,body)
    }

 */