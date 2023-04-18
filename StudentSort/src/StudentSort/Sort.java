package StudentSort;
import java.util.ArrayList;
import java.util.Comparator;

public class Sort {																							// create a class called sort that will utilize selection sort

	public static void sort(ArrayList<Student> studentArrayList, Comparator<Student> studentComparator) {
		int listSize = studentArrayList.size();																// declare listSize as the array's size to make it easier to write loops
		
		for(int i = 0; i < listSize - 1; ++i) {																// one by one move through the unsorted array
			int minimumIndex = i;																			// declare element as the first element in the array
			for(int j = i + 1; j < listSize; ++j) 
				if(studentComparator.compare(studentArrayList.get(j), studentArrayList.get(minimumIndex)) < 0)
				minimumIndex = j;																			// declare found element as the new minimum element
				// Swap the found minimum element with the first element
	            Student temp = studentArrayList.get(minimumIndex);											// make a new temporary variable
	            studentArrayList.set(minimumIndex, studentArrayList.get(i));								// get the two variables
	            studentArrayList.set(i, temp);																// change the first element to the found smallest element
		}
	}
}