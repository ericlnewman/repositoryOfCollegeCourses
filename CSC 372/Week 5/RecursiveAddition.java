import java.util.Scanner;                                                   // import scanner class for user input

public class RecursiveAddition{

    public static int result(int result){                                   // method to get user input, store in array and display to terminal
        int[] array = new int[6];                                           // declare array, must be 6 to avoid array index out of bounds exception
        System.out.println("Enter five numbers");                        // prompt user to enter five numbers for array
        for(int i = 1; i <= 5; i++){                                       // iterative for loop to get numbers into array, requires user to enter 
            Scanner in = new Scanner(System.in);                           // declare a scanner to get input from user named in
            array[i] = in.nextInt();                                       // add each number of user input to array
        } // end for loop
        result = recursiveSum(array, 6);                            // assign the value of result withe the method recursiveSum recursive method
        System.out.println("Sum is: " + result);                          // print the sum of the user numbers entered into the array added via the recursive method
        return result;                                                    // return the result
  } // end result method
    public static int recursiveSum(int[] array, int count) {             // recusive method called recursiveSum
        if (count > 0){                                                  // condition is if variable count is greater than zero return the recursive case                               
            return (array[count - 1] + recursiveSum(array, count - 1));  // recursive case direct head recursion
        } 
        else{                                                           // base case
            return 0;                                                   // when count is less than 0 then return 0
        } // end recursive method
    }
        public static void main(String[] args){                         // main method
            result(0);                                          // call result method
        } // end main
} // end class