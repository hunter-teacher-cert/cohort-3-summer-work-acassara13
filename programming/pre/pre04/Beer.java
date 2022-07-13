import java.io.*;
import java.util.*;

public class Beer {
  public static void chorus(int num)
  {
     System.out.println(num + ("  bottles of beer on the wall "));
    System.out.println(num + ("  bottles of beer on the wall ,ya’ take one down, ya’ pass it around, "));
      System.out.println(num-1 + ("  bottles of beer on the wall "));
  }

  public static void main(String[]args){

    for (int i = 99; i > 1; i--){
    chorus(i);
       
  }
}
}
