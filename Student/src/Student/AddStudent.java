package Student;

/**
 * @author Eric Newman
 * CSU Global
 * CSC 372 - Programming II
 * 11/05/2022
 */

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
			// class to add students
public class AddStudent {

	public static void addStudent(List<Student> list) throws GPAException {		 // method that adds students to "list" and throws custom exception to validate GPA
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int numberOfStudents;
		try {
			System.out.println("Amount of students to enter?");
			numberOfStudents = in.nextInt();                              		  // assign the value of students
			for(int i = 0; i < numberOfStudents; ++i) {                           // the for loop to enter student information
				try {
					in.nextLine();												  // accept user input
					System.out.println("Name: ");								  // prompts user to enter a name for a student
					String name = in.nextLine();								  // assigns the value of name to the input by user
					System.out.println("Address: ");							  // prompts user to enter an address for a student
					String address = in.nextLine();								  // assigns the value of address to the input by user
					System.out.println("GPA: ");								  // prompts user to enter a GPA for a student
						try{
							double GPA = in.nextDouble();						  // assigns the value of GPA to the input by user
							validateGPA(GPA);									  // validate the value of the GPA
							Student student = new Student(name, address, GPA);
							list.add(student);
							}
						catch(GPAException g) {
						 System.out.println("Enter correct input. A GPA is between 0.0 and 4.0 \nTry again\n");
							i--;												  // decrement the value of the for loop when the custom exception is caught
						} // end of try ... catch for validating GPA
				} // end try within for loop
				catch(InputMismatchException ime) {
					System.out.println("Enter correct input.\nTry again\n");
					i--;														 // decrement the value of the for loop when the input mismatch exception is caught
				} // end of try ... catch for checking input mismatch within for loop
			} // end of for loop
		} // end try for the addStudent method
		catch(InputMismatchException ime1) {
			System.out.println("Enter correct input.\nTry again\n");
		} // end of try ... catch for correct amount of students (i.e. needs to be a number) for addStudent method
	System.out.println("Success! Look for Student_Info.txt");					// notify user that information was successfully entered and created file
	} // end of addStudent method
		private static double validateGPA(double GPA) throws GPAException {		// method to throw the custom exception for GPA
			if (GPA > 4.0) {													// a GPA must be less than 4.0
				throw new GPAException("You entered a number that was higher than 4.0, please enter a valid GPA", new RuntimeException());
			} else if(GPA < 0.0) {												// a GPA must be greater than 0.0
				throw new GPAException("You entered a number that was lower than 0.0, please enter a valid GPA", new RuntimeException());
			} else {															// the GPA is within the correct value
				return GPA;
		} // end of conditional statements for validateGPA
	} // end of validateGPA method
} // end of class


