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
    /* code goes here! */
    return true;
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

    System.out.print("Enter an integer: ");
    int num = kboard.nextInt();
    
    System.out.println (num + "! = " + factorial(num));
/*    if (isPrime(num))
      System.out.println(num + " is a prime number!");
    else
      System.out.println(num + " is NOT a prime number.");
 */         
    kboard.close();
  }
}

