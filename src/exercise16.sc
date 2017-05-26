 /**
  *  Problem: Power digits sum
  *
  *  @Author: Chris M. Perez
  *  @Date:   5/26/2017
  **/

  object exercise16{
   val powerDigitsSum = BigInt(2).pow(1000).toString().map(_.asDigit).sum;
   println(powerDigitsSum)
  }