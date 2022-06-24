
import java.io.*;
import java.util.*;


public class Craps{
  int dieRoll = 0;
  public static void main(String[] args) {  
    round();
  }
  public int roll()
  {
    dieRoll = (int) (Math.random()*6)+1;
    return dieRoll;
  }
  public static int shoot()
  {
    Craps d1 = new Craps();
    Craps d2 = new Craps();
    System.out.println("Lets play Craps!");
    int roll1 = d1.roll();
    int roll2 = d2.roll();
    int rollTotal = roll1 + roll2;
    System.out.println("You rolled a " + roll1 + " and a " +roll2);
    System.out.println("your total is " + rollTotal);
    return rollTotal;
  }

  public static void round()
  {
    int rollTotal = shoot();
    if (rollTotal ==7 || rollTotal == 11)
    {
      System.out.println("You won!");
    }
    else if (rollTotal == 2 || rollTotal == 3 || rollTotal == 12)
    {
      System.out.println("You lose!");
    }
    else
    {
      int point = rollTotal;
      boolean plays = true;
      while(plays)
      {
        rollTotal = shoot();
        if (rollTotal == point)
        {
          System.out. println("You win!");
          plays = false;
    
        }
        else if (rollTotal == 7){
          System.out. println("You lose!");
          plays = false;
        }
      }
    }
  }
}