import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures{
    public static void addDay (ArrayList<String> weekArray, String weekDay) {
        weekArray.add(weekDay);
     }
    public static void addTemp (ArrayList<Integer> tempArray, int tempDay){
        tempArray.add(tempDay);
    }  
    

    public static void main(String[] args) {
            ArrayList<Integer> tempArray = new ArrayList<>();
            ArrayList<String> weekArray = new ArrayList<>();
            ArrayList<String> weekTempDay = new ArrayList<>();
            int daysInAWeek = 7;
            String weekDay = "-";
            int tempDay = 0;
            Scanner input = new Scanner(System.in);
           
           
            for(int i = 0; i < weekArray.size(); ++i){
                System.out.println("Enter the week day: ");
                weekDay = input.nextLine();
                addDay(weekArray, weekDay);
                System.out.print("Enter the temperature: ");
                tempDay = input.nextInt();
                addTemp(tempArray, tempDay);
           }
           
            int days = weekArray.indexOf(weekDay); //get the in index of the day
            int temps = tempArray.indexOf(tempDay);
            if(days != -1){ 
                System.out.print("The temperature for " + weekArray.get(days) +" is " + tempArray.get(temps) + " degrees.");

            }else if(weekDay.equals("week")){

                int averageTemp = 0;
                for (int i = 0; i < tempArray.size(); ++i) {
                    averageTemp += tempDay;
                }
                averageTemp /= daysInAWeek;

                for (int i = 0; i < weekArray.size(); i++) { 
                    weekTempDay.add(weekArray.get(i) + " " + tempArray.get(i)); // Concat the two, and add it
                    System.out.println(weekTempDay.get(i));
                }
                System.out.print("The average temperature for the week is " + averageTemp + " degrees.");
            }else{
                // can't recognise the entry
                System.out.println("Wrong entry");
            }
    }
}