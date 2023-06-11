package StudentSort;
import java.util.Comparator;

public class StudentCompareName implements Comparator<Student>{
	  	
		@Override      															// compare two student instances by name
	    public int compare(Student objOne, Student objTwo){
	        return objOne.getName().compareTo(objTwo.getName());				// compares the two values to see if the strings are the same
	}
}