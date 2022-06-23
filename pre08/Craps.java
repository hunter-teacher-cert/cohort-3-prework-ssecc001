import java.util.Random;
import java.io.*;
import java.util.*;
import java.util.Scanner;
Scanner in=new Scanner (System.in);

public class Die {
    public static void main(String[] args) {
      public Die()
        {
        dieRoll = 0;
        }
public int roll()
  {
  dieRoll = int (Math.random()*6)+1;
  return dieRoll;
  }
public int shoot()
  {
  Die d1 = new Die();
  Die d2 = new Die();
  System.out.println("Lets play Craps!");
  int roll1 = d1.roll();
  int roll2 = d2.roll();
  int rollTotal = roll1 + roll2;
  System.out.println("You rolled a " + roll1 )
  }
    
  }