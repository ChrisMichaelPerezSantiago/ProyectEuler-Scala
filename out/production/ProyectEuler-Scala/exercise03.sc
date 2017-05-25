 /**
  *  Problem: Even Fibonacci numbers
  *
  *  @Author: Chris M. Perez
  *  @Date:   5/25/2017
  **/

object exercice03{
   var arg = 600851475143L;
   val primeFactors = (2 to math.sqrt(arg).toLong).find(arg % _ == 0).fold(arg).andThen(i => arg / i);
   println(primeFactors)
 }
