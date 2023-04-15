public class Employee{
    // fields
    private String firstName;
    private String lastName;
    private int employeeID;
    private double salary;

    public Employee(){
        // no args constructor
    }
        // constructor
    public Employee(String firstName, String lastName, int employeeID, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.salary = 0.0;
    }
        // setters and getters methods
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    public void setLastName(String newLastName){
        lastName = newLastName;
    }
    public void setEmployeeID(int newEmployeeID){
        employeeID = newEmployeeID;
    }
    public void setSalary(double newSalary){
        salary = newSalary;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public double salary(){
        return salary;
    }
        // print out method
    public void employeeSummary(){

        System.out.println("Employee first name: "+firstName+"\nEmployee last name: "+lastName+
                            "\nID number: "+employeeID+"\nSalary: "+salary);

    }

}

