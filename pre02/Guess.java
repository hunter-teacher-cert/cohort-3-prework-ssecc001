import java.util.Random;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Guess{

    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        int num;
        System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is? \n");
        System.out.print("Your number is: ");
        num = in.nextInt();
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.print("The number I was thinking of is: " + number);
        System.out.print("\nYou were off by ");
        System.out.println(num - number);
    }
}