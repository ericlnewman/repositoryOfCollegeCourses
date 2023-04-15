// the main to start the program
public class ShowInfo {

    public static void main(String[] args){

        Info info = new Info(); //instantiate each of the Info objects
        info.setFirstName("Joe");
        info.setLastName("Black");
        info.setStreet("North Street");
        info.setCity("Greenwich");
        info.setzip("06830");

        // print info
        System.out.println("First name: " + info.getFirstName());
        System.out.println("Last name: " + info.getLastName());
        System.out.println("Street name: " + info.getStreet());
        System.out.println("City name: " + info.getcity());
        System.out.println("Zip code: " + info.getzip());
    }  
}
/*List<Automobile> vehicleInventory = new ArrayList<Automobile>();
    
Automobile vehicle = (autoArray(vehicleInventory));

    for (Automobile vehicles: vehicleInventory) {
        System.out.println(vehicles);

    } */
