/**
 * Some fun with Prime Numbers. 
 * APCS @ HB
 * Java Methods (Litvin & Litvin) Chapter 7
 */

import java.util.Scanner;


public class MathFun
{

  /** isPrime checks whether an integer is a prime number.
    * Negative integers are automatically NOT prime.
    * @param n the number to check
    * @return whether the parameter is prime
    */
  public static boolean isPrime (int n)
  {
   if (n <= 2)
      return false;
    if (n % 2 == 0)
      return false;
    int divisor = 3;
     while (Math.sqrt(n) >= divisor)
    {
      if (n % divisor == 0)
        return false;
      divisor += 2;
    }
    return true;
  }
  
  /**
   * Estimates the natural log of 2 by iterating the sum of a sequence.
   * 1 - 1/2 + 1/3 - 1/4 etc.
   * @param n the number of iterations
   * @return estimate for ln(2)
   */
  public static double ln2(int n)
  {
    double sum = 0.0;
    for (int i = 1; i <= n; i++)
    {
      if (i % 2 == 1)
        sum += 1.0 / i;
      else
        sum -= 1.0 / i;
    }
    return sum;
  }
  
  /** factorial calculates n! = 1 * 2 * ... * (n-1) * n
    * 0! = 1.  
    * Precondition: n >= 0
    * Precondition: n <= 15 or there will be an integer overflow.
    * @param n the number to take the factorial of
    * @return n! = 1 * 2 * ... * (n-1) * n
    */
  public static int factorial (int n)
  {
    int result = 1;
    for (int i = 1; i <= n; i++)
      result *= i;
    return result;
  }
  
  /** The main method is used to test the other math methods that are included in the class.
    * It has no other role.   */
  public static void main (String [] args)
  {
    Scanner kboard = new Scanner(System.in);


    System.out.print("Enter an integer (0 to quit): ");
    int num = kboard.nextInt();
  
    while (num != 0)
    {
/*      double estimate = ln2(num);
      System.out.println ("Estimate for ln(2): " + estimate);
      System.out.println ("Differs from ln(2) by " + (estimate - Math.log(2)));
      System.out.println ();
*/                 
//    System.out.println (num + "! = " + factorial(num));
      
    if (isPrime(num))
      System.out.println(num + " is a prime number!");
    else
      System.out.println(num + " is NOT a prime number.");
    
          
      System.out.print("Enter an integer (0 to quit): ");
      num = kboard.nextInt();
   
    }
    kboard.close();
  }
}

