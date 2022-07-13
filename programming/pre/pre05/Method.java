import java.io.*;
import java.util.*;

public class Method {

  //Question 2 Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.
    public static boolean isDivisible(int n, int m){
      if (n%m==0) {
        return true;
      } 
      return false;
    }

  //Question 3 Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.
    public static boolean isTriangle(int l1, int l2, int l3) {	
		
		  if (l1 > (l2 + l3)) {
			  return false;
		} else if (l2 > (l1 + l3)) {
			  return false;
		} else if (l3 > (l1 + l2)) {
			  return false;
		} else {
			  return true;
		}
	}
// Question 8 Write a method called ack that takes two ints as parameters and that computes and returns the value of the Ackermann function.
  public static int ack(int m, int n) {
		if (m == 0) {
			return n + 1;
		}
		else if (n == 0) {
			return ack(m - 1, 1);
		}
		else {
			return ack(m - 1, ack(m, n - 1)); 
		}
	}
	
	public static void main(String[] args) {
		System.out.println("A(0, 0) = " + ack(0, 0));
		System.out.println("A(0, 1) = " + ack(0, 1));
		System.out.println("A(1, 0) = " + ack(1, 0));
		System.out.println("A(2, 1) = " + ack(2, 1));
		System.out.println("A(1, 1) = " + ack(1, 1));
		System.out.println("A(2, 2) = " + ack(2, 2));

    isTriangle(2,4,6);
	}
}
   
