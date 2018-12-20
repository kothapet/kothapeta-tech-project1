case class WeeklyWeatherForecast(temperatures: Seq[Double]) {

  private def convertCtoF(temp: Double) = temp * 1.8 + 32

  def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF) // <-- passing the method convertCtoF
}



object TestFunc {

  private def promotion(salaries: List[Double], promotionFunction: Double => Double): List[Double] =
    salaries.map(promotionFunction)

  def smallPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * 1.1)

  def bigPromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * math.log(salary))

  def hugePromotion(salaries: List[Double]): List[Double] =
    promotion(salaries, salary => salary * salary)

  def doubleSalary(x: Double): Double = {
      x * 2
  }

  def main(args: Array[String]) {


/*
 * Function syntax ??
 *   def [funcName][ (parmeterName : Type) [,(parmeterName : Type)] ..] : [ReturnType} = <expression>
 *   val funcName = [ (parmeterName : Type [,parmeterName : Type] ..)]  => <expression>:ReturnType
 *   val funcName: ParmType, ParmType, ... ,ReturnType = [ (parmeterName  [,parmeterName ... )]  => <expression>
 *
 */
    /*
    val salaries = Seq(20000.0, 70000.0, 40000.0)
    println(salaries.map(doubleSalary))   // calling a function defined above

    //Function calling functions
    val salar1 = List(20000.0, 70000.0, 40000.0)
    println(salar1)

    println(smallPromotion(salar1))   // calling a function defined above
    println(bigPromotion(salar1))   // calling a function defined above
    println(hugePromotion(salar1))   // calling a function defined above

    //Functions returning functions
    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
      val schema = if (ssl) "https://" else "http://"
      (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }

    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)
    //returns a function (endpoint: String, query: String) => s"https://www.example.com/$endpoint?$query"
    println(getURL)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query)
    println("url : " + url)
    *
    */

    //nested methods
     def factorial(x: Int): Int = {
        def fact(x: Int, accumulator: Int): Int = {
          if (x <= 1) accumulator
          else fact(x - 1, x * accumulator)
        }
        fact(x, 1)
     }

     println("Factorial of 2: " + factorial(2))
     println("Factorial of 3: " + factorial(3))

    // Just like variable are declared as val VarName : Type
    //   Functions can be declared as val FuncName : ParmType, ParmType, ... , ReturnType
    // val doubleSalary2: Int => Int = (x) => x * 2
    // OR
    // val doubleSalary2 = (x : Int) => (x * 2):Int
    // val doubleSalary2 = (x) => x * 2

    /*
    val doubleSalary2: Int => Int = (x) => x * 2  // equals function(x: Int) :Int = { x * 2 }
    println(salaries.map(doubleSalary2))   // inline function defined above

    println(salaries.map(x => x * 2))     // inline lambda

    val sq1 = Seq(10.0, 10.5, 11.0, 11.5)
    println(sq1)
    val wc1 = WeeklyWeatherForecast(sq1)
    println(wc1.forecastInFahrenheit)
    *
    */


  }

}