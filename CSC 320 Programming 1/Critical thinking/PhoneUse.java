import java.util.Scanner;

public class PhoneUse {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String serviceProvider;
        String phoneModel;
        int monthlyMinutes;
        int monthlyData;
        int monthlyMinutesUsed;
        int monthlyDataUsed;
        int remainingMinutes;
        int remainingData;

        System.out.println("Which is your provider:" + '\n' + "Usually these are: AT&T, T-Mobile, Sprint, Google Fi, Verizon, Mint, Boost." + '\n' +"");
        serviceProvider = input.nextLine();
        System.out.println( '\n'+ "Which is your phone:" + '\n' + "Usually these are: Samsung Galaxy, Google Pixel, Apple iPhone."+ '\n' +"");
        phoneModel = input.nextLine();
        System.out.println( '\n'+ "Which is your monthly plan minutes:" +'\n' +"Usually these are: 500, 1000, 2000, 5000 minutes."+ '\n' +"");
        monthlyMinutes = input.nextInt();
        System.out.println( '\n'+ "Amount of minutes used: ");
        monthlyMinutesUsed = input.nextInt();
        System.out.println( '\n'+ "Which is your data limit" + '\n'+ "Usually these are: 10, 15, 20, 25, 30, 35 GBs."+ '\n' +"");
        monthlyData = input.nextInt();
        System.out.println( '\n'+"Amount of data used: ");
        monthlyDataUsed = input.nextInt();
        
        remainingMinutes = (int) monthlyMinutes - monthlyMinutesUsed;
        remainingData = (int) monthlyData - monthlyDataUsed;

        System.out.println("Your provider is: " + serviceProvider + '\n' + "Your phone model is: " + phoneModel + '\n' +"Remaining minutes: " + remainingMinutes + " minutes left." + '\n' + "Remaining data: " + remainingData + " GB left.");
    }
    
}
