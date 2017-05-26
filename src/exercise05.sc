/**
  *  Problem: Smallest multiple
  *
  *  @Author: Chris M. Perez
  *  @Date:   5/26/2017
  **/

object exercice05 {
  val smallestMultiple = Range(20 , Int.MaxValue)
    .find(i => Range(2, 21).forall(i % _ == 0)).get;

  println(smallestMultiple.toLong)
}


