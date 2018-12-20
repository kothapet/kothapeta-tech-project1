

trait Pet {
  val name: String
}


class Point1(var x: Int = 0, var y: Int = 0) {

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
  }

  override def toString: String =
    s"($x, $y)"
}

class Point2 {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  def x = _x  // x is a getter - same as def x () : Int = { _x }
  // x_= is a setter
  def x_= (newValue: Int): Unit = {
    if (newValue < bound) _x = newValue else printWarning
  }

  def y = _y
  def y_= (newValue: Int): Unit = {
    if (newValue < bound) _y = newValue else printWarning
  }

  private def printWarning = println("WARNING: Out of bounds")
}

trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
  def setNext(x: A): Unit
}

class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 0
  override def setNext(x: Int) = {current = x}
  override def hasNext: Boolean = current < to
  override def next(): Int =  {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }
}


object hello2 {
  def main(args: Array[String]) {
    /*
    val point1 = new Point1(2, 3)
    point1.x  // 2
    println(point1)  // prints (2, 3)

    println(new Point1)
    println(new Point1(1))
    println(new Point1(y=2))

    var point2 = new Point1(2, 3)
    println(point2)
    point2.x = 10
    point2.y = 11
    println(point2)

    val pt10 = new Point2
    pt10.x = 99
    pt10.y = 101 // prints the warning

    val iterator = new IntIterator(10)
    println(iterator.next())  // returns 0
    println(iterator.next())  // returns 1
    iterator.setNext(5)
    println(iterator.next())  // returns 1
    println(iterator.next())  // returns 1

    class Cat(val name: String) extends Pet
    class Dog(val name: String) extends Pet

    val dog = new Dog("Harry")
    val cat = new Cat("Sally")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(pet => println(pet.name))
    *
    */
    val planetDistanceFromSun = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6 ), ("Mars", 227.9), ("Jupiter", 778.3))

    planetDistanceFromSun.foreach{ tuple => {

      tuple match {

          case ("Mercury", distance) => println(s"Mercury is $distance millions km far from Sun")

          case p if(p._1 == "Venus") => println(s"Venus is ${p._2} millions km far from Sun")

          case p if(p._1 == "Earth") => println(s"Blue planet is ${p._2} millions km far from Sun")

          case _ => println("Too far....")

        }

      }

    }

    val numPairs = List((2, 5), (3, -7), (20, 56))

    for ((a, b) <- numPairs) {

      println(a, b, a * b)

    }


  }


}