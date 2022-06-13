import java.io.*;
import java.util.*;


public class Time {
  public static void main(String[] args){
    int hour = 10;
    int mintue = 54;
    int second = 50;
    System.out. print("Seconds since Midnight \n ");
    System.out.print((hour*60 + mintue) * 60 + second);
    int totalSec = 86400;
    int timeMid = 39290;
    System.out.print("\n");
    System.out.println(totalSec - timeMid);
  }
}