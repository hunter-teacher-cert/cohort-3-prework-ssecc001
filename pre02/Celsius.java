import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Celsius {
  public static void main(String[] args){
    Scanner in=new Scanner (System.in);
    double cel;
    double fah;
    System.out.print("Exactly how many degrees Celsius? ");
    cel = in.nextDouble();
    fah = (cel * 9/5 + 32);
    System.out.printf("%.2f cel = %.1f fah", cel, fah);
  }
}