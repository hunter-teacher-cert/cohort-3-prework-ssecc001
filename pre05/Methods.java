import java.util.*;
//Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.

public class Divisible{
public static boolean isDivisible (int n, int m) {
  if (n % m = 0 )
    return true;
  else
    return false;
}
}

//If you are given three sticks, you may or may not be able to arrange them in a triangle. For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. For any three lengths, there is a simple test to see if it is possible to form a triangle:

//If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
//Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.


public class Method {
  public static void main(String[] args) {
  Scanner in=new Scanner (System.in);
    int x;
    int y;
    int z;
    x = in.nextInt();
    y = in.nextInt();
    z = in.nextInt();
  public static boolean isValidTriangle(int a, int b, int c) {
  if (a + b > c && b + c > a && c + a > b);
    System.out.print("is a triangle");
    else
    System.out.print("is not a triangle");
  }
  }
}