import java.io.*;
import java.util.*;
public class Time {
  public static void main(String[]args){
   int hour=13;
    int min=20;
    int second=30;
    int SecInMin = 60;
    int SecInHour = 60 * SecInMin;
    int SecInDay = 24 * SecInHour;
    int SecFromMid = hour*SecInHour + min*SecInMin + second;
        System.out.println("Seconds since midnight: " + SecFromMid);
        System.out.println(SecInDay - SecFromMid + " seconds remain.");
        System.out.println(SecFromMid * 100 / SecInDay +
            "% of the day is over.");
  }
}