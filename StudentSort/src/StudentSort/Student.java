package StudentSort;
import java.util.Objects;

public class Student {
    // declaration of fields, or instance of variables
	private int rollno;                                               // rollno field as a string and private
    private String name;                                              // name field as a string and private
    private String address;                                           // address field as a string and private
    // constructor method used to initialize objects
    public Student(int rollno, String name, String address){

        this.rollno = rollno;                                         // Initialize rollno and reference to the corresponding field with this.
        this.name = name;                                             // Initialize name and reference to the corresponding field with this.
        this.address = address;                                       // Initialize address and reference to the corresponding field with this.
    }
        // setters (mutators) and getters (accessors) methods
    public int getRollNo(){                                     	  // get/access 
        return rollno;
    }
    public String getName(){                                   		  // get/access 
        return name;
    }
    public String getAddress(){                                		  // get/access 
        return address;
    }

	    public void setRollNo(int rollno){                     		  // set/mutate 
	    	 // Checking if number is less than zero
	        if (rollno < 0) {
	             throw new IllegalArgumentException("Enter a number");	  // throw an exception if there is an invalid number for the roll number put in
	        }
	    	this.rollno = rollno;
	    	}
	    public void setName(String name){                         		 // set/mutate 
	        if(name == null) {
	        	throw new IllegalArgumentException("Enter a name.");     // throw an exception if there is an invalid string for student name
	        }
	    	this.name = name;
	    	}
	    public void setAddress(String address){                   		// set/mutate 
	    	if(address == null) {
	        	throw new IllegalArgumentException("Enter an address.");// throw an exception if there is an invalid string for address
	        }
	    	this.address = address;
	    	}  

    @Override           // Overrides the toString() method to print the details of a student
    public String toString() {
        return ("Student's roll number is " + rollno +
                ", name is " + name +
                ", and address is " + address + "\n");
    }
    @Override
    public boolean equals(Object obj) {      // Override the equals() method to compare two object instances with the parameter obj,
        if (this == obj) return true;        // and returns true if the two instance are the same
        if (obj == null || getClass() != obj.getClass()) return false; // else if it is empty or there is not obj to get, it is false
        Student student = (Student) obj; 	//  the reference object with which to compare is assigned to student object
        return rollno == student.rollno && Objects.equals(name, student.name) && Objects.equals(address, student.address); // returns each if true
    } //  if the arguments are equal to each other and false otherwise if the any of the arguments are not null and valid imports, equality is determined 
} // end class
