import java.util.Scanner;

public class CelsiusToFahrenheit {


   public static double Convert(double degreesInC){

      final double fraction = 1.8;
      final double addThe32 = 32.0;
      double CtoF;
      
      CtoF = (degreesInC * fraction + addThe32);
      
      return CtoF;
   }


   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      double tempF;
      double tempC;

      System.out.println("Enter temperature in Celsius: ");
      tempC = scnr.nextDouble();

      tempF = Convert(tempC); 

      System.out.print("Fahrenheit: ");
      System.out.println(tempF);
   }
}