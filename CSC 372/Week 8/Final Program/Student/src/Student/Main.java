package Student;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Eric Newman
 * CSU Global
 * CSC 372 - Programming II
 * 11/05/2022
 */
// class that has main method, called Main
public class Main {
	/**
	 * @param args
	 */
		// main method
	public static void main(String[] args) {
		List<Student> list = new LinkedList<Student>();                            		        // create new LinkedList with the name "list"
			try {
				AddStudent.addStudent(list);													// catch exceptions, particularly to validate GPA
			} catch (GPAException g) {
				g.printStackTrace();
			} // end of try ... catch for validating GPA
	
		Collections.sort(list);																	// use java's built in sorting from collections to sort "list"
		Iterator<Student> it = list.iterator();													// use java's built iterator to access elements of "list"
			try {
					FileWriter fw = new FileWriter("Student_Info.txt");							// make a new file called "Student_Info" as a txt file
					while(it.hasNext()) {
						fw.write(it.next().toString()+"\n");									// write sorted "list" to txt file "Student_Info"
				}
					fw.close();																	// close the file writer
				} catch(IOException e) {														// catch an input output exceptions
					e.printStackTrace();
		} // end try ... catch for input output exceptions
	} // end main method
} // ends Main class