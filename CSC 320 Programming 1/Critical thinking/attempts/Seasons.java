import java.util.Scanner; 

public class Seasons {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      String inputMonth;
      int inputDay;
      String[] monthsWinter = new String[]{"January", "February"};
      String[] monthsSpring = new String[]{"April", "May"};
      String[] monthsSummer = new String[]{"July", "August"};
      String[] monthsAutumn = new String[]{"October", "November"};
      String[] monthsInTwoSeasons = new String[]{"December", "March", "June", "September", };
      System.out.println("Enter Month: ");
      inputMonth = input.nextLine();
      System.out.println("Enter day: ");
      inputDay = input.nextInt();
         if(inputDay >= 32){
         
            System.out.print("Invalid");
         
         } else if((inputMonth == monthsWinter[0]) || (inputMonth == monthsWinter[1])){
         
            System.out.println("Winter");
         
         } else if((inputMonth == monthsSpring[0]) || (inputMonth == monthsSpring[1])){
         
            System.out.println("Spring");
         
         } else if((inputMonth == monthsSummer[0]) || (inputMonth == monthsSummer[1])){
            
            System.out.println("Summer");
            
         } else if ((inputMonth == monthsAutumn[0]) || (inputMonth == monthsAutumn[1])){
         
            System.out.println("Autumn");   
         
         } else if((inputMonth == monthsInTwoSeasons[0]) && (inputDay < 21)){
            
            System.out.println("Autumn");   
         
         } else if ((inputMonth == monthsInTwoSeasons[0]) && (inputDay >= 21)){
            
            System.out.println("Winter");
         } else if ((inputMonth == monthsInTwoSeasons[1]) && (inputDay < 20)){
            
            System.out.println("Winter");
            
         } else if ((inputMonth == monthsInTwoSeasons[1]) && (inputDay >= 20)){
            
            System.out.println("Spring");
            
         } else if ((inputMonth == monthsInTwoSeasons[2]) && (inputDay < 21)){
            
            System.out.println("Spring");
            
         } else if ((inputMonth == monthsInTwoSeasons[2]) && (inputDay >= 21)){
            
            System.out.println("Summer");
            
         } else if ((inputMonth == monthsInTwoSeasons[3]) && (inputDay < 21)){
            
            System.out.println("Summer");   
         } else if ((inputMonth == monthsInTwoSeasons[3]) && (inputDay >= 21)){
            
            System.out.println("Autumn");
            
         } else {
              System.out.print("Invalid");
         }
   }
}