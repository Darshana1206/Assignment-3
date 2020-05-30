package recursion

object Q4 {
  def main(args:Array[String])
  {
    print("Enter a value: ")
    var x=scala.io.StdIn.readInt()
    
    println("It is a even number:"+isEven(x))
    println("It is a odd number:"+isOdd(x))

  }
  def isEven(n:Int):Boolean= n match{
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int):Boolean = !( isEven(n))
}