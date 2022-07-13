import java.io.*;
import java.util.*;
public class Date {
  public static void main(String[]args){
    String day="Friday";
    int date=6;
    String month="May";
    int year=2022;
    System.out.println(day);
    System.out.println(date);
    System.out.println(month);
    System.out.println(year);
    System.out.println("American format:"+" "+day+ " " + month + " " + date + ", " + year);
    System.out.println("European format:" +" " day + " "+ date + " " + month + " " + year);
  }
}