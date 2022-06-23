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
public class int roll()
  {
  dieRoll = int (Math.random()*6)+1;
  return dieRoll;
  }
public class int shoot()
  {
  Die d1 = new Die();
  Die d2 = new Die();
  System.out.println("Lets play Craps!");
  int roll1 = d1.roll();
  int roll2 = d2.roll();
  int rollTotal = roll1 + roll2;
  System.out.println("You rolled a " + roll1 + " and a " +roll2);
  System.out.println("your total is " + rollTotal);
  }

public int round()
  {
  if (rollTotal ==7 || rollTotal == 11)
  {
    System.out.println("You won!");
 else if (rollTotal == 2 || rollTotal == 3 || rollTotal ==12)
  {
    System.out.println("You lose!")
  }
  else
  {
  int point = rollTotal;
  boolen plays == true;
  while(plays)
  shoot()
  if (roll Total == point)
    {
    System.out. println("You win!");
    plays == false;
    
    }
  else if (rollTotal == 7)
    System.out. println("You lose!");
    plays == false;
  }
  }
  }
  }