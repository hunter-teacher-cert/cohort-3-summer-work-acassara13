//
/**
Teacher: What does the word Linear mean to you?
How can we apply that definition to searching through an array?
Goal 1 - Compare binary vs linear search?  *Assuming we have reviewed binary search.
Assignment 1 - Diagram the procedure and outline the steps involved in a linear search

What variables do you have to initialize as parameters?
What does this program return if the value is not found? If found?
Why do we initialize foundIndex to -1? 
What do we need to type inside of a class when we are creating a class?
*/
public class linearSearch{
// Method that takes 2 parameters - first parameter is an integer value and the second parameter is the data arrayList
  // What is next after creating a class?
  // Why do we need this?
  public int linearSearch(int value, ArrayList<Integer> data) { 
    //Do we need to create another variable to keep track of anything?
    //Initializing and declaring a variable called FoundIndex and setting the value to -1
    int foundIndex = -1;
    //How do we traverse through an array?
    // This code loops through the arrayList (data) in increments of 1
    for (int i=0; i < data.size(); i++) {
  // Initializing and declaring a variable called element and setting the value to the element in index i of the data ArrayList
      int element = data.get(i);
  //this is a condition stmt that compares the values of element and value to see if they are equal
      //how do we compare values?
      if (element == value) {
// if it is true it sets the variable foundIndex to i
        //What happens when we find the value?
        foundIndex = i;
        // breaks out from the for loop 
        //Do we need to complete the loop after the value is found?
        break;
        }
      }
    //returns the value of foundIndex
    return foundIndex;
  }


  
}