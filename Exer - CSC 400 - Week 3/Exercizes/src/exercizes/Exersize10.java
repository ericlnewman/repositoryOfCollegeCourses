package exercizes;
import java.util.Date;
public class Exersize10 {

	
	public static void algo(long i) {
		long sum = 0;
		for (long counter = i; counter > 0; counter = counter - 2)
		sum = sum + counter;
	}
	public static void main(String[] args) {
		
			long startTime, stopTime, elapsedTime;
	        Date current;
	
	        System.out.println("Results for different values of n");
	        System.out.println();
	        System.out.println("n\t\tAlgorthim(msec)");
	        for (long i = 200000000; i > 0 ; i =- 2) {
	        System.out.print(i + "\t");
	        // Algorithm
	        current = new Date();               // Get current time
	        startTime = current.getTime();
	        algo(i);                      // Execute algorithm A
	        current = new Date();               // Get current time
	        stopTime = current.getTime();
	        elapsedTime = stopTime - startTime; // In milliseconds
	        System.out.print("\t" + elapsedTime);
	        System.out.println();
        } // end for
        
     } // end main

 } // end exersize 10