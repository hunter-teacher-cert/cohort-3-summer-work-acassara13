import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Guess {
  public static void main(String[]args){
    Random random = new Random();
        int myNum = random.nextInt(100) + 1;
        int UserGuess;
       Scanner scan = new Scanner(System.in);
    System.out.println("I am thinking of a number between 1 and 100");
    System.out.println("Type a number: ");
     UserGuess = scan.nextInt();
    System.out.println("Your guess is: "+ UserGuess);
    System.out.println("The number I was thinking of is: "+myNum);
       System.out.print("You were off by: ");
         System.out.print(myNum-UserGuess);
    
  }
}