package recursion

object Q1 {
  def main(args:Array[String]){
     println(findPrime(5))
     println(findPrime(8))
    
  }
  def findGCD(m:Int,n:Int):Int=n match{
    case 0=> m
    case x if x>m => findGCD(x,m)
    case _ =>findGCD(n,m%n)
  }
  //println(findGCD(15,35))
  def findPrime(a:Int,n:Int=2):Boolean=n match{
    case x if(x==a)=>true
    case x if (findGCD(a,x)>1)=>false
    case x=> findPrime(a,x+1)
  }
   
}