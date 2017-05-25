 /**
  *  Problem: Multiple Of 3 and 5
  *
  *  @author: Chris M. Perez
  *  @date:   5/25/2017
  **/


 object exercice01{
   val list = List.range(1,1000).filter(
      i => i % 3 == 0 || i % 5 == 0
   ).sum;

   println(list)
}
