/**
  *  Problem: Even Fibonacci numbers
  *
  *  @Author: Chris M. Perez
  *  @Date:   5/25/2017
  **/

object exercice01{
  val fib:Stream[Int] = 0 #::fib.scanLeft(1)(_ + _).takeWhile(_ < 4000000);
  val result = fib.filter( _ % 2 == 0 ).sum;
  println(result);
}
