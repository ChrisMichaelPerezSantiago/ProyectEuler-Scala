  /**
  *  Problem: Largest palindrome product
  *
  *  @Author: Chris M. Perez
  *  @Date:   5/26/2017
  **/

object exercice04{
    def isPalindrome(str: String) = str.equals(str.reverse);

    val largestPalindromeProuduct = (100 until(1000))
      .flatMap(i => ((100000/i+1) until(1000)).map(_ * i))
      .filter(i => isPalindrome(i.toString)).max

      println(largestPalindromeProuduct);
}
