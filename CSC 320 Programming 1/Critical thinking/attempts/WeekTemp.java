import java.util.Scanner;
import java.util.ArrayList;

public class WeekTemp{

    public static void addDay (ArrayList<String> weekArray, String weekDay) {
        weekArray.add(weekDay);
     }
    public static void addTemp (ArrayList<Double> tempArray, Double tempDay){
        tempArray.add(tempDay);
    }
    public static void deleteDay(ArrayList<String> weekArray, String weekDay){
        int i = 0;
        boolean rid = false;

        while((!rid) && (i < weekArray.size())) {

            if (weekArray.get(i).equals(weekDay)){
                weekArray.remove(i);
                rid = true;
            }
            i++;}
           while((!rid) && (i < tempArray.size()) ){
                if(tempArray.get(i).equals(TempDay)){
                tempArray.remove(i);
                rid = true;
            }
        }i++;
    }

    public static void printWeek(ArrayList<String> arrayWeekTemp){

    for (int i = 0; i < length; i++) { // Loop through every name/phone number combo
        arrayWeekTemp.add(weekArray.get(i) + " " + tempArray.get(i)); // Concat the two, and add it
    }
}
    public static void main(String[] args){

    ArrayList<String> weekArray = new ArrayList<String>();
    ArrayList<Double> tempArray = new ArrayList<Double>();
    ArrayList<String> arrayWeekTemp=new ArrayList<String>();
    String weekDay = "-";
    Double tempDay = 0.0;
    String urInput = "-";
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the day of the week you wish to add.\n");
    System.out.println("Type 'day' to add day, 'temp' to add temperature");
    System.out.println("Type 'p' to print, 'd' to delete, 'r' for reference to commands, 'exit' to exit");

    while(!urInput.equals("exit")){
        System.out.println("What's your command? ");
        urInput = input.next();
    
                if (urInput.equals("day")){
                    System.out.print(" Enter day: \n");
                    weekDay = input.nextLine();
                    addDay(weekArray, weekDay);
                }
                if (urInput.equals("temp")){
                    System.out.print(" Enter the temperature: ");
                    tempDay = input.nextDouble();
                    addTemp(tempArray, tempDay);
                }
                if(urInput.equals("d")){
                    System.out.print(" Enter day to delete: ");
                    deleteDay(weekArray, weekDay);
                }
                if(urInput.equals("r")){
                    System.out.println(" 'day' to add day, 'temp' to add temperature\n'p' to print, 'd' to delete\n'r' for reference to commands, 'exit' to exit");
                }
                else if (urInput.equals("p")){
                    System.out.print("Would you like to show a specific day or the week?");
                    String pInput = input.nextLine();
                    if(pInput.equals("week")){
                    printWeek(arrayWeekTemp);
                    }
                    else if(pInput.equals("day")){
                        System.out.println("Which day? ");
                        weekDay = input.nextLine();
                        for(int i = 0; i < arrayWeekTemp.size(); ++i){
                            if(arrayWeekTemp.get(i).equals(weekDay));
                                return;
                    }
                }
            }
        }

    }
}

// System.out.println("Commands are:\n - 'exit' to terminate,\n - 'temp' to enter daily temperatures,\n - 'week' to show the week's temperature and average temperature.");

//while(!userInput.equals("exit")){
 //   System.out.print("Command: ");