import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Celsius {
  public static void main(String[]args){
    double celsius = 0.0;
    double fahrenheit = 0.0;
    Scanner scan = new Scanner(System.in);
     System.out.print("Enter Celsius temp: ");
     celsius = scan.nextDouble();
    fahrenheit = (celsius * (9.0/5.0) + 32 );
    System.out.println("Fahrenheit temp = "
                         +fahrenheit);

  }
}