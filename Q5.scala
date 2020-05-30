package recursion

object Q5 {
  def main(args:Array[String])
  {
    print("Enter a number: ")
     var x=scala.io.StdIn.readInt()
     
     println(sumeven(x))
    
  }
  
   def sumeven(x:Int):Int = x match{
    case x if (x<1) => x
    case x if (x%2==0) => (x-2) + sumeven(x-2)
    case x if (x%2==1) => (x-1) + sumeven(x-1)
  }
 
}   

