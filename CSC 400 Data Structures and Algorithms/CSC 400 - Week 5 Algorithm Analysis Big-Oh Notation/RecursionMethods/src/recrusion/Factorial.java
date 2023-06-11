package recrusion;
import java.util.Scanner;

class Factorial {

	public long recursive(long n) {
		if(n <= 1) {	// base case
			return n;
		} else {		// recursive case
			return n * recursive(n-1);
		}
	}
	
	public long tailRecursive(long n, long a) {
		if(n <= 1) // if less than 1 return n (base case)
				return a;
		return tailRecursive(n-1, n*a); // recursive case
	}
	
	// A wrapper over tailRecursive to make the single number provided accepted as n and a as 1
	long tail(long n) {
		return tailRecursive(n, 1);
	}
	
	Scanner in = new Scanner(System.in);	// scanner for input
	public void printNonTail() {
		System.out.println("Enter a number: ");	// asking user for input
		long num = in.nextLong();						// getting that user input putting it to variable num
			System.out.println("The factorial using non-tail recursion is " + recursive(num));

		}
	public void printTail() {
		System.out.println("Enter a number: ");	// asking user for input
		long num = in.nextLong();						// getting that user input putting it to variable num
		System.out.println("The factorial using tail recursion is: " + tail(num));
		}
}