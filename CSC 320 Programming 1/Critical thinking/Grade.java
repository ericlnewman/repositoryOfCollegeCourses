import java.util.Scanner;

public class Grade {

    public static void main(String[] args){
    double average, swap;
    double total = 0;
    Scanner sc = new Scanner(System.in);

    System.out.println("How many grades (i.e. if ten grades, enter 10): "); 
    int n = sc.nextInt(); // how many elements will be in the array

    double array[]= new double[n]; // makes an array that is uses the type double
    System.out.println("Enter grades for each element below.\n");
    for (int k = 0; k < n; k++) { 
        System.out.print("Enter grade ("+k+"): "); 
        array[k] = sc.nextDouble(); // Gets elements in list
        }
        for(int l = 0; l < n; l++){
            total = total + array[l];
        } average = total / n ;
        System.out.printf("The average is: %.3f\n", average);
        
        for (int i=0; i < n; i++) 
        {
            for (int j = i+1; j < n; j++) { 
                if (array[i] > array[j]) 
                {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        System.out.printf("Maximum: %.3f\n", array[n-1]);
        System.out.printf("Minimum:  %.3f\n", array[0]);
    }
}
