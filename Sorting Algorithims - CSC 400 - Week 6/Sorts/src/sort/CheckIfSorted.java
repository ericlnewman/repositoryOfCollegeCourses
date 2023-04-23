package sort;

public class CheckIfSorted {

	// a boolean function to see if a given array is sorted
	// in ascending order, True or False
	static boolean sortedTOrF(int array[], int n){
	        // Array has one or no element
	        if (n == 0 || n == 1)
	            return true;
			// if larger than 1 element, iterate over the entire array
	        for (int i = 1; i < n; i++)
	            // if left element array[i - 1] is greater than array[i] it's not sorted
	            if (array[i - 1] > array[i])
	                return false;
	        // otherwise the array is sorted
	        return true;
	}
		// print out whether the array is sorted
	void printTOrF(int[] array){
			int n = array.length;
	 
	        if (sortedTOrF(array, n))
	            System.out.print("True\n");
	        else
	            System.out.print("False\n");
	}
}