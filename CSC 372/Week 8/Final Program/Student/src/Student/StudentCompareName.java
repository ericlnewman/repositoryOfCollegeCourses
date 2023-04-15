package Student;

import java.util.Comparator;

public class StudentCompareName implements Comparator<Student>{					// compare class for the string name

	@Override      																// compare two student instances by name
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());							// compares the two values to see if the strings are the same
	}

}