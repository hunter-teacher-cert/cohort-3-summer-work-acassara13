import java.io.*;
import java.util.*;

//pre conditions - students have learned about conditionals and this exercise will put their learning into practice
//scaffold to intro to Methods
//tQ What is the first line of code when we start a Java program
public class 02_livecode_JAVA{
// tQ What is needed in order to run all Java programs?
//  WHat are the main sections of our Java program?
//   Comment out your procedures below.

  //Brainstorm theme. plot, setting, characters, potential conflict
 // Teacher Example theme - horror - plot - zombie apocalypse setting - abandoned hospital - characters - Zombie Hunters, Zombies potential conflict - Kill them all
// Main Method
public static void main(Strings args[]){
//Tq How do we get user input?
Scanner in = new Scanner(System.in);
 
System.out.printl("You woke up to a world overun by zombies! You run and make your way to an abaondon hospital. You see two doors; do you enter A. Door 1 or B. Door 2?")
//How do we make the program "read' the input"
  //Hint - Do we have to create a variable? If so, what type and why?
String response = in.nextLine();
  // First Condiitonal goes here...
  // PROVIDE IF/ELSE starter code
	if (response == "A"){
		System.out.println("You picked door A and there's a zombie behind it! You scramble to find a weapon. Do you A. Try to fight the zombie with the spoon you found? or B. Try to run past it and get away?")
	//
	}else{
    System.out.println("You picked door B and as you enter the room, you see that the floor has collapsed! Do you A. Use the rope you find to try to swing across? Or B. Do you use the rope to explore the basement??")
	
		
	}
// Second Conditional goes here...

	
}


  
  

	
}