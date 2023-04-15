public class ShowAuto {

    
    public static Automobile autoArray(ArrayList<Automobile> auto) {
        
        Scanner in = new Scanner(System.in);
        String userInput = "-";
        System.out.println("   *** Vehicle Inventory Program ***\n");
        System.out.println("Commands: 'a' add, 'd' delete,\n'p' print vehicle, 's' to show all\n'q' quit: ");
            while(!userInput.equals("q")){
                System.out.print("Command: ");
                userInput = in.next();
                if (userInput.equals("a")) {try {
                System.out.println("Enter Vehicle Make: ");
                setMake(in.nextLine());
                String make = setMake(in.nextLine());
                System.out.println("Enter Vehicle Model: ");
                setModel(in.nextLine());
                System.out.println("Enter Vehicle Color: ");
                setColor(in.nextLine());
                System.out.println("Enter Vehicle Year: ");
                setYear(in.nextLine());
                System.out.println("Enter Vehicle Mileage: ");
                setMileage(in.nextInt());

                Automobile vehicle =  new Automobile(make, model, color, year, mileage);
                    auto.add(vehicle);
                    in.close();
                    return vehicle;
            }
            catch (Exception e) {
                    System.out.println(e.getMessage());
            }
        }
            if (userInput.equals("d")) {            
                
                System.out.print("Model of Vehicle to delete: ");
                model = in.nextLine();
                removeAuto(vehicle);
                }

            if (userInput.equals("p")){
                System.out.print("Model of Vehicle to show: ");
                model = in.nextLine();
                printVehicle(vehicle);
                }
            
                else if (userInput.equals("s")) {
                    printAll(auto);
                } 
            }
        }


    public static void main(String[] args) {
        Automobile Automobile = new Automobile();
       
}
}