/**
 * SuperArray by Team MarvelvsDC
 * First Last
 * collaborators: First Last, First Last
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
  this.data= new int[size];//init underlying/inner storage of specified capacity
    this.numberElements = size;
    
    /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
    /* YOUR SIMPLE+SMART CODE HERE */

  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
   this.data= new int [10];
    this.numberElements=10;
    //init underlying/inner storage of capacity 10
        /* YOUR SIMPLE+SMART CODE HERE */

    //init instance vars
        /* YOUR SIMPLE+SMART CODE HERE */
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    if (numberElements == this.data.length)
			//resize(this.data.length + 10);

		data[numberElements] = value;
		numberElements++;
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    /* YOUR SIMPLE+SMART CODE HERE */

    // add item
    /* YOUR SIMPLE+SMART CODE HERE */


    // increment numberElements
    /* YOUR SIMPLE+SMART CODE HERE */

  }//end add()


  public boolean isEmpty()
  {
    if(numberElements==0){
      return true;
    }
    else{
    return false;
    }//return whether this SuperArray instance is empty
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public int get(int index)
  {
    if (index >= numberElements || index < 0) {
			return -1;
		} else {
			return data[index];
		}//return item at index
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public String toString()
  {
    String output = "[ ";
		for (int i = 0; i < numberElements; i++)
			output += data[i] + " ";
		output += "]";

		return output;//return stringified version of this Object
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end toString()


  // //return Stringified version of this Object,
  // // with extra debugging info
  // //(helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    if (index >= numberElements || index < 0) {
			//return -1;
		} else {
			index = data[index];
			for (int i = index; i < numberElements-1; i++)
				data[i] = data[i+1];
			numberElements--;
			
		}
    // shift items down to remove the item at index
    /* YOUR SIMPLE+SMART CODE HERE */

    // subtract fom numElements;
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  public void add(int index, int value)
  {
    if (index >= value) {
			add(10);
		} else if (index >= 0) {
			if (value == data.length)
				//resize(value + 10);
			for (int i = value; i > index; i--)
				data[i] = data[i-1];

			data[index] = 0;
			numberElements++;
		}
    // see if there's enough room
    /* YOUR SIMPLE+SMART CODE HERE */

    // shift elements toward the end of the array
    /* YOUR SIMPLE+SMART CODE HERE */

    // insert new element
    /* YOUR SIMPLE+SMART CODE HERE */

    // increment numElements
    /* YOUR SIMPLE+SMART CODE HERE */
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    /* YOUR SIMPLE+SMART CODE HERE */
  }//end grow()

}//end class