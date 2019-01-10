import scala.util.Random

object testPatternMatching {
	def main(args: Array[String]): Unit = {

	  // simple pattern match like java case
	  val x: Int = Random.nextInt(10)
	  println( x, 
      x match {
        case 0 => "zero"
        case 1 => "one"
        case 2 => "two"
        case _ => "many"
      }
	  )

	  // pattern match function
	  def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
    }
    println(matchTest(3))
    println(matchTest(1))
    
	  // pattern match class types
    abstract class Notification
    case class Email(sender: String, title: String, body: String) extends Notification
    case class SMS(caller: String, message: String) extends Notification
    case class VoiceRecording(contactName: String, link: String) extends Notification

    def showNotification(notification: Notification): String = {
      notification match {
        case Email(email, title, _) =>
          s"You got an email from $email with title: $title"
        case SMS(number, message) =>
          s"You got an SMS from $number! Message: $message"
        case VoiceRecording(name, link) =>
          s"you received a Voice Recording from $name! Click the link to hear it: $link"
      }
    }
    val someSms = SMS("12345", "Are you there?")
    val someVoiceRecording = VoiceRecording("Tom", "voicerecording.org/id/123")
    
    println(showNotification(someSms)) 
    println(showNotification(someVoiceRecording))  

	  // pattern guards additional if statements in case
    def showImportantNotification(notification: Notification, importantPeopleInfo: Seq[String]): String = {
      notification match {
        case Email(email, _, _) if importantPeopleInfo.contains(email) =>
          "You got an email from special someone!"
        case SMS(number, _) if importantPeopleInfo.contains(number) =>
          "You got an SMS from special someone!"
        case other =>
          showNotification(other) // nothing special, delegate to our original showNotification function
      }
    }
    
    val importantPeopleInfo = Seq("867-5309", "jenny@gmail.com")
    
    val someSms1 = SMS("867-5300", "Are you there?")
    val someVoiceRecording1 = VoiceRecording("Tom", "voicerecording.org/id/123")
    val importantEmail = Email("jenny@gmail.com", "Drinks tonight?", "I'm free after 5!")
    val importantSms = SMS("867-5309", "I'm here! Where are you?")
    
    println(showImportantNotification(someSms1, importantPeopleInfo))
    println(showImportantNotification(someVoiceRecording1, importantPeopleInfo))
    println(showImportantNotification(importantEmail, importantPeopleInfo))
    println(showImportantNotification(importantSms, importantPeopleInfo))

    // patten matching on type only
    abstract class Device
    case class Phone(model: String) extends Device{
      def screenOff = model + " Turning screen off"
    }
    case class Computer(model: String) extends Device {
      def screenSaverOn = model + " Turning screen saver on..."
    }
    
    def goIdle(device: Device) = device match {
      case p: Phone => p.screenOff
      case c: Computer => c.screenSaverOn
    }
    
    val p1 = Phone("Nokia")
    val c1 = Computer("HP")
    
    println(goIdle(p1),  goIdle(c1))
    
    //sealed classes - all subtypes must be in the same file
    sealed abstract class Furniture
    case class Couch() extends Furniture
    case class Chair() extends Furniture
    
    def findPlaceToSit(piece: Furniture): String = piece match {
      case a: Couch => "Lie on the couch"
      case b: Chair => "Sit on the chair"
    }
    
    println(findPlaceToSit(Couch()))
    println(findPlaceToSit(Chair()))
    
	}  
}