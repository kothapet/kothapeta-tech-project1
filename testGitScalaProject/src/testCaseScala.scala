

object testCaseScala {

  def main(args: Array[String]): Unit = {
 
      case class Book(isbn: String)
      val frankenstein = Book("978-0486282114")
      println(frankenstein.isbn)
      
      var f1 = Book("9989-0486282114")
      println(f1.isbn)
      f1 = Book("978-0486282114")
      println(f1.isbn)
      
      if (frankenstein == f1) {
        println("frankenstein == f1")
      } else {
        println("frankenstein != f1")
      }
      
      //all case class variables are public
      case class Message(sender: String, recipient: String, body: String)
      val message1 = Message("guillaume@quebec.ca", "jorge@catalonia.es", "Ça va ?")
      
      println(message1.sender)  // prints guillaume@quebec.ca
      //message1.sender = "travis@washington.us" //wouldn't compile because message1 is val 

      val message2 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
      val message3 = Message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
      println( "equals "  + (message2 == message3)) 
      
      //copying
      val message4 = Message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
      val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")

      println(message5)

   }
  
}