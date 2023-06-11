public class Manager extends Employee{
    private String department;
        //default constructor and calling super/base class default constructor
    public Manager() { 
        super();                           
        department = null;
    }
            //set and get methods for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String newDepartment) { 
        department = newDepartment;
    }
        //calling super class method
    public void employeeSummary() {
        super.employeeSummary();     
        System.out.println("Department : " + department);
    }
}
