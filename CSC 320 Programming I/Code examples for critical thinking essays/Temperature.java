import java.util.Scanner;
import java.util.ArrayList;

public class Temperature{

    public static void main(String[] args){

        ArrayList<String> weekArray = new ArrayList<String>();
        ArrayList<Double> tempArray = new ArrayList<Double>();
        Scanner input = new Scanner(System.in);
        String userInput = "-";
        
        weekArray.add("Monday");
        weekArray.add("Tuesday");
        weekArray.add("Wednesday");
        weekArray.add("Thursday");
        weekArray.add("Friday");
        weekArray.add("Saturday");
        weekArray.add("Sunday");
        
        System.out.println("This program stores the daily average temperatures for one week.\n - 'q' to quit\n - 'temp' to add temperature\n - 'week' to show week and average temperature");
        while (!userInput.equals("q")) {
            System.out.print("Command: ");
            userInput = input.next();

            if (userInput.equals("temp")){
                    for(String day : weekArray){
                        System.out.print("Enter the temperature for "+ day + ": ");
                        double temperature = input.nextDouble();
                        tempArray.add(temperature);
                    }
                }

            if(userInput.equals("week")){
                    
                        for(int i = 0; i < weekArray.size(); ++i){
                        System.out.print(weekArray.get(i)+ " ");
                        System.out.println(tempArray.get(i));}
                        
                        double total = 0.0;
                        for(int j = 0; j < tempArray.size(); ++j){
                            total = total + tempArray.get(j);
                        }
                        double average = (double) total / tempArray.size();
                        System.out.printf("The average is: %.2f\n",average);
                        tempArray.clear();
                        System.out.print("To quit type 'q' to the ");
                }
        }
    }
}             