// constructor
public class Info {
    // instance variables
    String firstName;
    String lastName;
    String street;
    String city;
    String zip;
 
    // constructor identifier ... no-arg constructor
    public Info(){

    }
    /*   constructor parameters / local variables 
     using the "this" keyword to mean the fields
     of the class not the parameters    */
    public Info(String firstName, String lastName, String street, String city, String zip ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }
    //  Getters and Setters
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public String getcity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getzip() {
        return zip;
    }
 
    public void setzip(String zip) {
        this.zip = zip;
    }
}
