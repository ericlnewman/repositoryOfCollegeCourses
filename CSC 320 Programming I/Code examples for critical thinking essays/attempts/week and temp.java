Scanner in = new Scanner(System.in);
ArrayList<String> days = new ArrayList<>();
ArrayList<Double> temperatures = new ArrayList<>();

days.add("Monday");
days.add("Tuesday");
days.add("Wednesday");
days.add("Thursday");
days.add("Friday");
days.add("Saturday");
days.add("Sunday");

 for (String day : days) {
     System.out.println("Enter the temperature for: " + day);
     double temp = in.nextDouble();
     temperatures.add(temp);
 }

 double sum = 0.0;
 for ( int i = 0; i < temperatures.size(); i++) {
     sum += temperatures.get(i);
 }

 double average = (double) sum / temperatures.size();

 System.out.println("Average temperatures = " + average);

 public class SwitchDemoFallThrough {

    public static void main(String[] args) {
        java.util.ArrayList<String> futureMonths =
            new java.util.ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);
            }
        }
    }
}
switch (month.toLowerCase()) { {
    case 1:  weekArray.add("Monday");
    case 2:  weekArray.add("Tuesday");
    case 3:  weekArray.add("Wednesday");
    case 4:  weekArray.add("Thursday");
    case 5:  weekArray.add("Friday");
    case 6:  weekArray.add("Saturday");
    case 7:  weekArray.add("Sunday");
    break;
    default: break;
}  