package StudentSort;
import java.util.Comparator;

public class StudentCompareRoll implements Comparator<Student>{
	 	
		@Override      	 														// compare two student instances by roll number
	    public int compare(Student objOne, Student objTwo){
	        return Integer.compare(objOne.getRollNo(), objTwo.getRollNo());		// compares the two values to see if the Integers s are the same
	}
}