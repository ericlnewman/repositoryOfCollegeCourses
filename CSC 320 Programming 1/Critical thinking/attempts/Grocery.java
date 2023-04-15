import java.util.Scanner;
import java.util.ArrayList;
public class Grocery{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        ArrayList<String> groceryList = new ArrayList<String>();
        ArrayList<String> amount = new ArrayList<String>();
        
        Boolean close = false;
		
		System.out.println("***************************\n       This program is for a weekly grocery list\n***************************\n");
		System.out.println("Enter '0'to exit\n \nor press any other key to continue\n");
		String item = input.nextLine();
		
        if (item == "0") {
			close = true;
			System.out.println("Program has been terminated.");
		}
		else {
			groceryList.add(item);
			
			do {
				
				System.out.println("Enter food, drink, etc. to get at the grocerys store: ");
				item = input.nextLine();
				groceryList.add(item);
				System.out.println("Please enter amount: ");
				amount.add(item);
				
				
			}while(item != "0");
  
    }
  }
}



        /*int len = groceryList.length;
        int siz =  groceryList.size();
        System.out.print("What food do you need to get at the store?\n");
        
        
        for(int i = 0; i < len; i++){
            groceryList.add(input.nextLine());
            System.out.print("Enter item: ");
        }
        System.out.println("Number in array: " +siz);
            // Display eveything in the list
            displayList(groceryList);*/


            // first attempt at week 5 arraylist with do while
             /*      Boolaean end = false;
             
             if(weekDay == "end"){
            end = true;
            System.out.println("Program terminated. Goodbye.");
            return;
        }
        else{
            weekArray.add(weekDay);
            tempArray.add(tempDay);
        do{

            System.out.println("\nPlease enter the day of the week you wish to add.   If you want to exit enter 'end'.");
        weekDay = input.nextLine();
        System.out.println("\nPlease enter the temperature of " + weekDay);
        tempDay = input.nextDouble();
        }while (weekDay != "end");
        

          final int numElements = 7;
    enum WeekDays{ 
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
   
    System.out.println("\n*********************************************************************\n\n   This program displays both the day and temperature for each day.\n \n*********************************************************************\n \n");
    
    while()
    
    for(int i = 0; i < numElements; ++i){
        weekDay.add(input.nextLine());
        System.out.print("Please enter the day of the week you wish to add:  ");
        tempDay.add(input.nextDouble());
        System.out.print("\nPlease enter the temperature of that day:  ");
        exit = input.nextLine();
        System.out.println("Enter 'y' to exit or any other key to continue\n");
        if(exit == "y"){
           i = numElements;
        }
    
        for(i=0; i < weekDay.size())
  
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
    }
        
        
        
        */

        
       /*  for(String weekDay : weekArray){
            System.out.print(" "+ weekArray.get(weekDay));
        }

    }
    public static void printTemp(ArrayList<Double> tempArray){
        for(Double tempDay : tempArray){
            tempArray.get(tempDay);
            String s=String.valueOf(tempDay);
            System.out.print(" " + s);
        } 
        )*/
