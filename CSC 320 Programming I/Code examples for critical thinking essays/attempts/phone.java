import java.util.Scanner;

public class Phone {

   public static String padLeft(String s, int n) {
       return String.format("%" + n + "s", s);  
   }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[] serviceProvider = new String[]{"AT&T", "T-Mobile", "Sprint", "Google Fi", "Verizon", "Mint", "Boost"};
        String[] phoneModel = new String[]{"Samsung Galaxy", "Google Pixel", "Apple iPhone"};
        int[] monthlyMinutes = new int[]{500, 1000, 2000, 5000};
        int[] monthlyData = new int[]{10, 15, 20, 25, 30, 35};
        int monthlyMinutesUsed;
        int monthlyDataUsed;
        int remainingMinutes;
        int remainingData;

        System.out.println(padLeft("Which is your provder" + '\n', 15) + serviceProvider[0] + ", " + serviceProvider[1]+ ", " + serviceProvider[2]+ ", " + serviceProvider[3]+ ", " + serviceProvider[4]+ ", " + serviceProvider[5]+", " + serviceProvider[6] + '\n' + "> ");
        serviceProvider = input.nextString();
        System.out.println(padLeft("Which is your phone model"+ '\n', 15) + phoneModel[0] + ", " + phoneModel[1] + ", " + phoneModel[2] + '\n' + "> ");
        phoneModel = input.nextString();
        System.out.println(padLeft("Which is your monthly plan minutes" +'\n', 15) + monthlyMinutes[0] + ", " + monthlyMinutes[1] + ", " + monthlyMinutes[2] + ", " + monthlyMinutes[3] + '\n' + "> ");
        monthlyMinutes = input.nextInt();
        System.out.println("How much minute used: ");
        monthlyMinutesUsed = input.nextInt();
        System.out.println(padLeft("Which is your data limit" + '\n', 15) + monthlyData[0] + ", " + monthlyData[1] + ", " + monthlyData[2] + ", " + monthlyData[3] +", " + monthlyData[4] + ", " + monthlyData[5] + '\n' + "> ");
        monthlyData = input.nextInt();
        System.out.println("How much data used: ");
        monthlyDataUsed = input.nextInt();

        remainingMinutes = (int) monthlyMinutes - monthlyMinutesUsed;
        remainingData = (int) monthlyData - monthlyDataUsed;

        System.out.println("Your provider is: " + serviceProvider + '\n' + "Your phone model is: " + phoneModel + '\n' +"Remaining minutes: " + remainingMinutes + '\n' + "Remaining data: " + remainingData);
    }
    
}
