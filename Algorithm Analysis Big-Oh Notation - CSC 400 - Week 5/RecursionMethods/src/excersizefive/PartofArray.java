package excersizefive;

import java.util.Arrays;

public class PartofArray {
	
		static void display(int[] array){
			   reverse(array, 0, array.length -1);		//display
			}

		static void reverse(int[] array, int first, int last){
			    if(first < last){						// Swap the variables
			       int temp = array[first];				// temporary element
			       array[first] = array[last];
			       array[last] = temp;
			       reverse(array, ++first, --last);		// Recursive call
			    }   
			}
		
	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
		System.out.println("Array before recursive function:\n" + Arrays.toString(arr));
		display(arr);
		int[] arr2 = Arrays.copyOfRange(arr,0,4);		// copy of array that has only the final parts of the array
		System.out.println("Array after, with only part of the array: ");
		System.out.println(Arrays.toString(arr2));

	}
	
}
