import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Automobile {

    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile(){

    }

    public Automobile(String make, String model, String color, int year, int mileage){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

     /* getters and setters  */

     public String getMake(Scanner in) throws Exception{
        if(make != null && make.length() == 0){

            throw new Exception("Failure");
    
          } else{
    
            System.out.println("Success\n");
          }
        return make;
    }
    public String getModel(Scanner in) throws Exception{
        if(model != null && model.length() == 0){

            throw new Exception("Failure");
    
          } else{
    
            System.out.println("Success\n");
          }
        return model;
    }
    public String getColor(Scanner in) throws Exception{
        if(color != null && color.length() == 0){

            throw new NumberFormatException("Failure");
    
          } else{
    
            System.out.println("Success\n");
          }
        return color;
    }
    public int getYear(Scanner in) throws Exception{
        if(year < 1886 || year > 2022){

            throw new NumberFormatException("Failure");
    
          } else{
    
            System.out.println("Success\n");
          }
        return year;
    }
    public int getMileage(){
        return mileage;
    }
    public void setMake(String make){
       
        this.make = make;
    }
    public void setModel(String model){

        this.model = model;
    }
    public void setColor(String color){
       
        this.color = color;
    }
    public void setYear(int year){
        
        this.year = year;
    }
    public void setMileage(int mileage){
       
        this.mileage = mileage;
    }
    @Override
    public String toString(){
        return "Vehicle: \n" + "make= " + make + ", model= " + model + ", color= " + color + ", year="
        + year + ", mileage= " + mileage + "\n";
    }
}
class Main{
    public static void main(String[] args) throws Exception{
        List<Automobile> vehicle = new ArrayList<>();
        Scanner in = new Scanner (System.in);
        int userInput;
        System.out.println("   *** Vehicle Inventory Program ***\n");
        System.out.println("Commands: \n - '1' add a vehicle, \n - '2' delete a vehicle, \n - '3' to update a vehicle,"
         + "\n - '4' to print to screen, \n - '5' to print vehicle the information to a file,\n - '0' quit\n");
      
        while (true){
                System.out.print("Command: ");
                userInput = Integer.parseInt(in.nextLine());

                    if (userInput == 1){ try{
                        System.out.println("Make: ");
                        String make = in.nextLine();
        
                        System.out.println("Model: ");
                        String model = in.nextLine();
        
                        System.out.println("Color: ");
                        String color = in.nextLine();
        
                        System.out.println("Year: ");
                        int year = Integer.parseInt(in.nextLine());
        
                        System.out.println("Mileage: ");
                        int mileage = Integer.parseInt(in.nextLine());

                        Automobile automobile = new Automobile (make, model, color, year, mileage);
                        vehicle.add(automobile);
                        System.out.println("Put " +model+ " in\n");
                       
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}
                    else if (userInput == 2 || userInput == 3){ try{

                        System.out.println("Choose the number of the vehicle (i.e. 0 for the first vehicle, 1 for the second, and so on\n");

                        for (int i = 0; i < vehicle.size(); i++){
                            System.out.println(i + " - " + vehicle.get(i));
                        }
                        System.out.print("Enter number:  ");
                        int automobileSelection = Integer.parseInt(in.nextLine());


                        if (automobileSelection < 0 || automobileSelection >= vehicle.size()){

                            System.out.println("Invalid Selection");
                        }
                        if (userInput == 2){

                            Automobile auto = vehicle.remove(automobileSelection);
                            System.out.println("Removed - " + auto);
                        }
                        else {

                            Automobile auto = vehicle.get(automobileSelection);
                            System.out.println("Updated Vehicle - " + auto);

                            System.out.print("Make: ");
                            auto.setMake(in.nextLine());

                            System.out.print("Model: ");
                            auto.setModel(in.nextLine());

                            System.out.print("Color: ");
                            auto.setColor(in.nextLine());

                            System.out.print("Year: ");
                            auto.setYear(Integer.parseInt(in.nextLine()));

                            System.out.print("Mileage: ");
                            auto.setMileage(Integer.parseInt(in.nextLine()));

                            System.out.println("Updated\n");
                        }
                    } catch(Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    
                    else if (userInput == 5){try {
                        
                   
                        System.out.println("Would you like to print to print the information to a file (Y or N)?");
                        String str= in.nextLine();
                        if(str.equals("Y")){
                            PrintWriter outFile = new PrintWriter(new FileWriter("vehicles.txt"));

                            for (Automobile auto : vehicle){
                                outFile.println(auto);
                            }
                            outFile.close();
                            System.out.println("All entries have been written a file 'vehicles.txt'");
                        }
                        if(str.equals("y")){
                            PrintWriter outFile = new PrintWriter(new FileWriter("vehicles.txt"));

                            for (Automobile auto : vehicle){
                                outFile.println(auto);
                            }
                            outFile.close();
                            System.out.println("All entries have been written a file 'vehicles.txt'");
                        }
                        if(str.equals("N")){
                            System.out.println("Will not be written to vehicles.txt");
                        }
                        if(str.equals("n")){
                            System.out.println("Will not be written to vehicles.txt");
                        }
                        else{
                            System.out.println("Invalid entry");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }}

                else if(userInput == 4){
                    for(Automobile auto : vehicle){
                        System.out.print(auto);
                    }

                }
            else if (userInput == 0){
                break;
            }
        }
    }
}