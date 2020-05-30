package recursion

object Q2 {
  def main(args:Array[String]){
     primeSeq(10)
  }
  def GCD(m:Int,n:Int):Int=n match{
    case 0 =>m
    case x if x>m => GCD(x,m)
    case _ => GCD(n,m%n)
   }
  //println(GCD(15,35))
  def Prime(a:Int,n:Int=2):Boolean=n match{
    case x if(x==a)=>true
    case x if (GCD(a,x)>1)=>false
    case x=> Prime(a,x+1)
  }
    
   def primeSeq(n:Int):Any={
      if(n>2)
        primeSeq(n-1)
       
       if(Prime(n)==true)
       {
         print(n+" ")
       }
    }
}
