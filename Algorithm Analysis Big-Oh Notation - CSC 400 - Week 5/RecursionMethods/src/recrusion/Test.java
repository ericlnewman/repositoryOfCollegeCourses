package recrusion;
import java.util.Scanner;

class Test extends Factorial{

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// inheriting the factorial and making it an object called fact
		Factorial fact = new Factorial();
		Scanner in = new Scanner(System.in);
		int n = 0;
		while(n == 0) {
			System.out.println("Find the factorial of a real number.\n - Enter 1 for tail recursion. \n - Enter 2 for nontail recursion.");
				
				while(n == 0) {
						n = in.nextInt();
						// using the methods of the inherited factorial class
						if( n == 1) {
							fact.printTail();
						} else if (n == 2) {
							fact.printNonTail();
						} else {
							System.out.println("Did not enter a 1 or 2, try again");
						n = 0;
					}

			}

		System.out.println("Would you like to enter another number to find the factorial?");
		System.out.println("Enter 1 to exit, any other number to continue.");
				n = in.nextInt();
				if(n == 1) {
					break;
				} else {
					n = 0;
				}

		}
	}
}
