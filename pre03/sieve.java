import java.io.*;
import java.util.*;
import java.util.Scanner;

public class print {
  public static void main(String[] args) {
    Scanner in=new Scanner (System.in);
    int num;
    num = in.nextInt();
    boolean[] primeNum = new boolean[num];
    for (int i= 2; i<=num;i++){
      if(isPrime(i)){
        primeNum[i-1] = true
        System.out.println(i); 
      }
    }
  }
  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= n/2; i++) {
      if (n % i == 0) {
        return false;
      }
      return true;
    }
  }
}
 