public class TestEmployee{
     //all set methods of super or parent class are available to derived class
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.setFirstName("David");       
        manager.setLastName("Doolittle");
        manager.setEmployeeID(123456789);
        manager.setSalary(12432.64);
        manager.setDepartment("Marketing");
        manager.employeeSummary();
    }
}