package StudentSort;
import java.util.Objects;

public class Student {
    // declaration of fields, or instance of variables
	private int rollno;                                               // rollno field as a string and private
    private String name;                                              // name field as a string and private
    private String address;                                           // address field as a string and private
    // constructor method used to initialize objects
    public Student(int rollno, String name, String address){

        this.rollno = rollno;                                         // intialize rollno and reference to the corresponding field with this.
        this.name = name;                                             // intialize name and reference to the corresponding field with this.
        this.address = address;                                       // intialize address and reference to the corresponding field with this.
    }
        // setters (mutators) and getters (accessors) methods
    public int getRollNo(){                                     // get/access 
        return rollno;
    }
    public void setRollNo(int rollno){                          // set/mutate 
        this.rollno = rollno;
    }

    public String getName(){                                   // get/access 
        return name;
    }
    public void setName(String name){                          // set/mutate 
        this.name = name;
    }
    public String getAddress(){                                // get/access 
        return address;
    }
    public void setAddress(String address){                   // set/mutate 
        this.address = address;
    }

    @Override           // Overrides the toString() method to print the details of a student
    public String toString() {
        return ("Student's roll number is " + rollno +
                ", name is " + name +
                ", and address is " + address + "\n");
    }
    @Override
    public boolean equals(Object obj) {     // Override the equals() method to compare two object instances with the parameter obj,
        if (this == obj) return true;       //  and returns true if the two instance are the same thus being false
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollno == student.rollno && Objects.equals(name, student.name) && Objects.equals(address, student.address);
    }
}
