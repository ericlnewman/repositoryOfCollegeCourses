package Student;
/**
 * @author Eric Newman
 * CSU Global
 * CSC 372 - Programming II
 * 11/05/2022
 */
		// student class that is the parent class for the code
public class Student implements Comparable<Student>{
	
	 	// declaration of fields, or instance of variables
	private String name;                                     	 	       // name field as a string and private
	private String address;                                    		       // address field as a string and private
	private double GPA;                                        		       // GPA field as a double and private
	
	   // constructor method used to initialize objects
	public Student(String name, String address,  double GPA) {
		this.name = name;                                    		      // Initialize name and reference to the corresponding field with this.
		this.GPA = GPA;                                    		     	  // Initialize GPA and reference to the corresponding field with this.
		this.address = address;                                		      // Initialize address and reference to the corresponding field with this.
	}
      // setters (mutators) and getters (accessors) methods											
		public String getName() {                                     	  // get/access for String name
			return name;												  // return name
		}
		
		public String getAddress() {                              		  // get/access for String address
			return address;												  // return address
		}
		
		public double getGPA() {                                		  // get/access for double GPA
			return GPA;												 	  // return GPA
		}
		
		public void setName(String name) {                 	    		  // set/mutate for String name
			this.name = name;											  // assign name to this.name (meaning the private field)
		}
		
		public void setAddress(String address) {                   		 // set/mutate for String address
			this.address = address;								  		 // assign address to this.address (meaning the private field)
		}
		
		public void setGPA(double GPA) {                         		 // set/mutate for double GPA
			this.GPA = GPA;											     // assign GPA to this.GPA (meaning the private field)
		}
	
	@Override          										 			// Overrides the toString() method to print the details of a student
	public String toString() {
		return("Name: " + name + "\nAddress: " + address +				// what it prints out as a string that contains the details entered by the user
				"\nGPA: " + GPA +"\n");
	}

	@Override															// compares the names of the students to make sure the order is correct
	public int compareTo(Student student) {
		return getName().compareTo(student.getName());
	} // end of constructor that contains the accessors and mutators
} // ends Student class