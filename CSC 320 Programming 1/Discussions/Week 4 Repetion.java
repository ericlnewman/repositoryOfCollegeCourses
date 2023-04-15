
import java.util.Scanner;

public class Repetition{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Enter a number: ");
        n = input.nextInt();

        // evaluates a condition and executes when a condition is true
        while(n > 0){
            --n;

            System.out.print(n + " ");
        }

        // do .. while. Executes do block first, then evaluates while condition
        do{
            --n;
            System.out.print(n + " ");

        } while(n > 0);

        /* for loop ... (a ; b ; c){does something}
        
        a = Declare and initialize control variable ;
        b = continuation condition;
        c =  increment/decrement          */

        int j; // need a new variable in addition to input from user with n
        for(j = 0; n > j; --n){

            System.out.print(n + " ");
        }

    int rows = 5;

    // outer loop
    for (int i = 1; i <= rows; ++i) {

      // inner loop to print the numbers
      for (int k = 1; k <= i; ++k) {
        System.out.print(k + " ");
      }
      System.out.println("");
    }

    int p;
    p = input.nextInt();
    while(p != 0){

        --p;        // if the user puts a negative integer it enters into an endless loop, and is uninentional
        System.out.println("will this end?");

    }

    for(;;){

        ;

    }

    {
        while ( x + y < z )
        {
           // Debugging below
           System.out.println( "[DEBUG] x = " + x + " y = " + y + " z = " + z ) ;
     
           // More code
        }
     }
    }
}