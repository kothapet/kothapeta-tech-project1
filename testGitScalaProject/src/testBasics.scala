import scala.language.dynamics
import java.io._

class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
  }

  def print() {
    println("Point x location : " + x);
    println("Point y location : " + y);
  }
}

case class casePoint(x: Int, y: Int)

class Location(override val xc: Int, override val yc: Int,
    val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    //x = x + dx
    //y = y + dy
    super.move(dx, dy)
    z = z + dz
  }
  override def print() {
    //println ("Point x location : " + x);
    //println ("Point y location : " + y);
    super.print();
    println("Point z location : " + z);
  }
}

class foo {

  def methodx(x: String): String = {
    x + "haha";
  }

  def method1(x: String, y: Integer): String = {
    x + y.toString();
  }

  def method2(x: String, y: Integer): String = {
    y.toString() + x;
  }

}
object Hello {

  def main(args: Array[String]) {

    /*
    println("hello world!")

    val foo1 = new foo;

    //println(foo1.applyDynamic("method1")("10", 20))
    println("method1 : " + foo1.method1("XX", 10))
    println("method2 : " + foo1.method2("XX", 10))

    //println("method1 : " + foo1.method2("XX", 10))
    //println("method1 : " + foo1.method2("XX", 10))

    val x = 10
    val y = "str"
    //x = 20      results error
    //y = "str1"  resutls error
    println("x : " + x)
    println("y : " + y)

    var x1 = 10
    var y1 = "str"
    println("x1 : " + x1)
    println("y1 : " + y1)
    x1 = 20
    y1 = "str1"
    println("x1 : " + x1)
    println("y1 : " + y1)

    val pt = new Point(10, 20);
    pt.print()
    // Move to a new location
    pt.move(10, 10);
    pt.print()

    val loc = new Location(10, 20, 15);
    loc.print()
    loc.move(10, 10, 5);
    loc.print()

    println({
      val x = 1 + 1
      x + 1
    }) // 3

    // functions with no names
    val addOne = (x: Int) => x + 1
    println(addOne(1)) // 2

    val add = (x: Int, y: Int) => x + y
    println(add(1, 2)) // 3

    val getTheAnswer = () => 42
    println(getTheAnswer()) // 42

    // methods
    def add1(x: Int, y: Int): Int = x + y
    println(add1(1, 2)) // 3

    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(1, 2)(3)) // 9

    def name: String = System.getProperty("user.name")
    println("Hello, " + name + "!")

    def getSquareString(input: Double): String = {
      val square = input * input
      square.toString
    }

    val pt1 = new Point(10, 20)
    val pt2 = new Point(10, 20)
    val pt3 = new Point(11, 21)

    if (pt1 == pt2) {
      println(pt1 + " and " + pt2 + " are the same.")
    } else {
      println(pt1 + " and " + pt2 + " are different.")
    } // Point(1,2) and Point(1,2) are the same.

    if (pt1 == pt3) {
      println(pt1 + " and " + pt3 + " are the same.")
    } else {
      println(pt1 + " and " + pt3 + " are different.")
    }


    val pt1 = new casePoint(10, 20)
    val pt2 = new casePoint(10, 20)
    val pt3 = new casePoint(11, 21)

    if (pt1 == pt2) {
      println(pt1 + " and " + pt2 + " are the same.")
    } else {
      println(pt1 + " and " + pt2 + " are different.")
    } // Point(1,2) and Point(1,2) are the same.

    if (pt1 == pt3) {
      println(pt1 + " and " + pt3 + " are the same.")
    } else {
      println(pt1 + " and " + pt3 + " are different.")
    }

    object IdFactory {
      private var counter = 0
      def create(): Int = {
        counter += 1
        counter
      }
    }

    val newId: Int = IdFactory.create()
    println(newId) // 1
    val newerId: Int = IdFactory.create()
    println(newerId) // 2

    val list: List[Any] = List(
        "a string",
        732,  // an integer
        'c',  // a character
        true, // a boolean value
        () => "an anonymous function returning a string"
      )

    list.foreach(element => println(element))
    * */

  }
}

/*
 * Function syntax ??
 *   def [funcName][ (parmeterName : Type) [,(parmeterName : Type)] ..] : [ReturnType} = <expression>
 *   val variableName = [funcName][ (parmeterName : Type) [,(parmeterName : Type)] ..] : [ReturnType} = <expression>
 *
 */

