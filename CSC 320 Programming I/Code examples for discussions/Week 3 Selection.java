import java.util.Scanner;

public class Selection{

    public static void main(String[] args){

        int x = 10;
        int y = 8;
        if (x > y) {
        System.out.println("x is greater than y");
        }

        int hour = 20;
        
        if (hour < 18) {
            System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
            
        int time = 22;
        
        if (time < 10) {
            System.out.println("Good morning.");
        }
        else if (time < 12) {
            System.out.println("Good afternoon.");
        }
        else if (time < 14) {
                System.out.println("Good day.");
        }
        else {
            System.out.println("Good evening.");
        }

        int x = 30;
        int y = 10;
  
        if( x == 30 ) {
           if( y == 10 ) {
              System.out.print("X = 30 and Y = 10");
           }
        }

        //int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
    

        Scanner input = new Scanner(System.in);


        int month = 3;
        int numDays = 0;
        //String monthString;

        switch(month){
            case 1: //monthString = "January";
            case 3: //monthString = "March";
            case 5: //monthString = "May";
            case 7: //monthString = "July";
            case 8: //monthString = "August";
            case 10: //monthString = "October";
            case 12: //monthString = "December";
                numDays = 31;
                break;
            case 4: //monthString = "April";
            case 6: //monthString = "June";
            case 9: //monthString = "September";
            case 11: //monthString = "November";
                numDays = 30;
                break;
            case 2: //monthString = "February";
                numDays = 28;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = "
                            + numDays);
       
        //another way to write the fall through case
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                    numDays = 31;
                     break;
            case 4: case 6:
            case 9: case 11:
                    numDays = 30;
                    break;
        
        int sizes = 9;
        String sizeName;

        switch(sizes){
            case 1: case 2: case 3:
                sizeName = "xxs";
                break;
            case 4: case 5: case 6: 
                sizeName = "xs";
                break;
            case 7: case 8: case 9:
                sizeName = "s";
                break;
            case 10: case 11: case 12:
                sizeName = "m";
                break;
            case 13: case 14: case 15:
                sizeName = "l";
                break;
            case 16: case 17: case 18:
                sizeName = "xl";
                break;
            default:
                System.out.println("Not valid clothing size.");
                }
        System.out.println("Clothing size is "
                            + sizeName);


                            public enum Day {
                                SUNDAY, MONDAY, TUESDAY, WEDNESDAY, 
                                THURSDAY, FRIDAY, SATURDAY 
                            }
                            
                            public class EnumTest {
                                Day day;
                            
                                public EnumTest(Day day) {
                                    this.day = day;
                                }
                            
                                public void tellItLikeItIs() {
                            
                                    switch (day) {
                                        case MONDAY: 
                                            System.out.println("Mondays are bad.");
                                            break;
                            
                                        case FRIDAY: 
                                            System.out.println("Fridays are better.");
                                            break;
                            
                                        case SATURDAY:
                                        case SUNDAY: 
                                            System.out.println("Weekends are best.");
                                            break;
                            
                                        default:
                                            System.out.println("Midweek days are so-so.");
                                            break;
                                    }
                                }
                            }
    }

}
       
        