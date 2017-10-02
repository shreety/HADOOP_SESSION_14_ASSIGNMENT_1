class RationalNumber(Num:Int, Deno:Int)
{
  var Numerator = Num/gcdRec(Num,Deno)
  var Denominator = Deno/gcdRec(Num,Deno)
  
  def this(Numerator:Int) =
  {
    this(Numerator,1)
    println("Whole number")
  }
  
  def gcdRec(x: Int, y: Int): Int = 
  {
      if(y == 0) 
        x 
      else gcdRec(y, x % y)
  }
  
  def AddNumbers(Number: RationalNumber) : RationalNumber= 
  {
    var number: RationalNumber = new RationalNumber((this.Numerator*Number.Denominator + this.Denominator *Number.Numerator),(this.Denominator *Number.Denominator))
    return (number)
  }
  
  def subtractNumbers(Number: RationalNumber) : RationalNumber= 
  {
    var number: RationalNumber = new RationalNumber((this.Numerator*Number.Denominator - this.Denominator *Number.Numerator),(this.Denominator*Number.Denominator))
    return (number)
  }
  
  def Division(Number: RationalNumber) : RationalNumber =
  {
    var number :RationalNumber = new RationalNumber(this.Numerator*Number.Denominator, this.Denominator *Number.Numerator)
    return (number)
  }
  
  def Multiply(Number: RationalNumber) : RationalNumber = 
  {
    var number :RationalNumber = new RationalNumber(this.Numerator*Number.Numerator, this.Denominator *Number.Denominator)
    return (number)
  }
  
}

object RationalNumber
{
  def main(args:Array[String]): Unit = {
    val firstNumber= new RationalNumber(3,4)
    val secondNumber= new RationalNumber(7,8)
    println("************Operation on Rational Numbers**************************")
    println("Addition of Number " +firstNumber.Numerator+"/"+firstNumber.Denominator+ " and " +secondNumber.Numerator+"/"+secondNumber.Denominator+ " is :" + firstNumber.AddNumbers(secondNumber).Numerator+ "/" +firstNumber.AddNumbers(secondNumber).Denominator)
    println("Substraction of Number " +firstNumber.Numerator+"/"+firstNumber.Denominator+ " and " +secondNumber.Numerator+"/"+secondNumber.Denominator+ " is :" + firstNumber.subtractNumbers(secondNumber).Numerator+ "/" +firstNumber.subtractNumbers(secondNumber).Denominator)
    println("Multiplication of Number "+firstNumber.Numerator+"/"+firstNumber.Denominator+ " and " +secondNumber.Numerator+"/"+secondNumber.Denominator+ " is :" + firstNumber.Multiply(secondNumber).Numerator+ "/" +firstNumber.Multiply(secondNumber).Denominator)
    println("Division of Number "+firstNumber.Numerator+"/"+firstNumber.Denominator+" and " +secondNumber.Numerator+"/"+secondNumber.Denominator+ " is :" + firstNumber.Division(secondNumber).Numerator+ "/" +firstNumber.Division(secondNumber).Denominator)
    
    println("*************Operation on Whole numbers****************************")
    val firstWholeNumber= new RationalNumber(3,1)
    val secondWholeNumber= new RationalNumber(7,1)
    println("Addition of Number " +firstWholeNumber.Numerator+"/"+firstWholeNumber.Denominator+ " and " +secondWholeNumber.Numerator+"/"+secondWholeNumber.Denominator+ " is :" + firstWholeNumber.AddNumbers(secondWholeNumber).Numerator+ "/" +firstWholeNumber.AddNumbers(secondWholeNumber).Denominator)
    println("Substraction of Number "+firstWholeNumber.Numerator+"/"+firstWholeNumber.Denominator+  " and " +secondWholeNumber.Numerator+"/"+secondWholeNumber.Denominator+ " is :" + firstWholeNumber.subtractNumbers(secondWholeNumber).Numerator+ "/" +firstWholeNumber.subtractNumbers(secondWholeNumber).Denominator)
    println("Multiplication of Number " +firstWholeNumber.Numerator+"/"+firstWholeNumber.Denominator+ " and "+secondWholeNumber.Numerator+"/"+secondWholeNumber.Denominator+  " is :" + firstWholeNumber.Multiply(secondWholeNumber).Numerator+ "/" +firstWholeNumber.Multiply(secondWholeNumber).Denominator)
    println("Division of Number "+firstWholeNumber.Numerator+"/"+firstWholeNumber.Denominator+ " and " +secondWholeNumber.Numerator+"/"+secondWholeNumber.Denominator+ " is :" + firstWholeNumber.Division(secondWholeNumber).Numerator+ "/" +firstWholeNumber.Division(secondWholeNumber).Denominator)

    
    
  }
}