package recursion

object Q6 {
  def main(args:Array[String])
  {
    fibSeq(5)
  }
  def Fibonacci(n:Int):Int=
  {
    if(n==0)
    {
      return 0
    }
    else if(n==1)
    {
      return 1
    }
        
    else
    {
      return (Fibonacci(n-1)+Fibonacci(n-2))
    }
  }
  def fibSeq(a:Int)
  {
    if (a>=0)
    {
      fibSeq(a-1)
      print(Fibonacci(a)+" ")
      
    }
      
      
      
  }
}