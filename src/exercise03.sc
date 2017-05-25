 /**
  *  Problem: Largest prime factor
  *
  *  @Author: Chris M. Perez
  *  @Date:   5/25/2017
  **/

object exercice03{
   def primeFactors(arg: Long): List[Long] =
     (2 to math.sqrt(arg).toInt).find(arg % _ == 0).fold(List(arg))(
       i => i.toLong::primeFactors(arg / i)
     );

   var arg = 600851475143L;
   println(println(primeFactors(arg).last))

 }
