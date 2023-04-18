package RecursiveAddition;
import java.util.Scanner;                                                   	// import scanner class for user input
import java.util.*;
public class RecursiveAddition{

    public static int result(int result){                                   	// method to get user input, store in array and display to terminal
        List<Integer> array = new ArrayList<>();								// declare array, must be 6 to avoid array index out of bounds exception
        System.out.println("Enter five numbers");                        		// prompt user to enter five numbers for array
        
        	for(int i = 1; i <= 5; i++){                                        // iterative for loop to get numbers into array, requires user to enter 
        		try {
        			@SuppressWarnings("resource")
					Scanner in = new Scanner(System.in);                        // declare a scanner to get input from user named in
        			array.add(in.nextInt());                                    // add each number of user input to array
        		  }
        		catch(Exception e){
        				i--;
        		    	System.out.println("Enter a number.");
        		  }
        		} // end for loop
        result = recursiveSum(array);                            				// assign the value of result with the method recursiveSum recursive method
        System.out.println("Sum is: " + result);                     			// print the sum of the user numbers entered into the array added 
        return result;                                                    		// via the recursive method and return the result 
        }// end result method
    
    public static int recursiveSum(List<Integer> array) {             			// Recursive method called recursiveSum
        if (array.isEmpty() == true ) {                                         // base case
            return 0;                                                  			// when count is less than 0 then return 0
        } else {
        	return array.get(0) + recursiveSum(array.subList(1, array.size())); // recursive case direct tail recursion
        } // end recursive method
    }
        public static void main(String[] args){                         		// main method
            result(0);                                          				// call result method
        } // end main
} // end class