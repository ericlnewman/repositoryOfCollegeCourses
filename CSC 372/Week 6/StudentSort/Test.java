package StudentSort;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		   ArrayList<Student> students = new ArrayList<Student>();
	       
		    Student stdOne = new Student(2001, "John Smith", "23 Main St");						// student one object and elements to array list
	        Student stdTwo = new Student(4651, "Tim Faire", "542 Rocky Hill Ln");				// student two object and elements to array list
	        Student stdThree = new Student(8642, "Lilly Hepford", "431 Meadow Ave");				// student three object and elements to array list
	        Student stdFour = new Student(1234, "Sam Adams", "17 Colorado St");					// student four object and elements to array list
	        Student stdFive = new Student(3783, "Jack Horseman", "4781 Long Blvd");				// student five object and elements to array list
	        Student stdSix = new Student(9571, "Steve Summit", "24 Main St");					// student six object and elements to array list
	        Student stdSeven = new Student(9991, "Rachel Turning", "843 Golden Rd");				// student seven object and elements to array list
	        Student stdEight = new Student(5431, "Jill Xu", "75 Cots Wold Close");				// student eight object and elements to array list
	        Student stdNine = new Student(8721, "Allie Stimple", "75891 Orange Ave");			// student nine object and elements to array list
	        Student stdTen = new Student(7694, "Grace White", "691 Oakwood Dr");					// student ten object and elements to array list

	        students.add(stdOne);																						// add to array
	        students.add(stdTwo);																						// add to array
	        students.add(stdThree);																						// add to array
	        students.add(stdFour);																						// add to array
	        students.add(stdFive);																						// add to array
	        students.add(stdSix);																						// add to array
	        students.add(stdSeven);																						// add to array
	        students.add(stdEight);																						// add to array
	        students.add(stdNine);																						// add to array
	        students.add(stdTen);																						// add to array

	       System.out.println("\n************************************  Orginal List  ************************************\n");
	        for (Student student : students) {																			// print out array with enhanced for loop
	            System.out.println(student);																			// shows the original list
	        }
	        Sort.sort(students, new StudentCompareName());																// sort list by first name
	        System.out.println("\n************************************  Sort by name  ************************************\n");
	        for (Student student : students) {																			// print out array with enhanced for loop
	            System.out.println(student);																			// shows the list softed by name
	        }
	        Sort.sort(students, new StudentCompareRoll());																// sort list by roll number
	        System.out.println("\n************************************  Sort by roll number  ************************************\n");
	        for (Student student : students) {																			// print out array with enhanced for loop
	            System.out.println(student);																			// shows the list softed by roll number
	        }
	}
}