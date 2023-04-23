package sort;

public class Bubble {
	
	public void bubble(int[] array) {
		int len = array.length;
		int temp = 0;
		for(int i = 0; i < len-1; i++)
			for(int j = 0; j < (len-i-1); j++)
				/*
				 * If current element, j, is compared with the next
				 * element. If current element is greater than
				 * the next element, it is swapped.
				 */
				if(array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
	}
}
