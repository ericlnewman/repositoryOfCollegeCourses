import java.util.Scanner;

public class Tax{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        int income;
        double[] tax = new double[]{0.10, 0.15, 0.20, 0.30};
        double takeHomePay;
        double taxWithHoldings;

        System.out.println("What is the weekly income?\nAs a reminder Typical ranges are: less than 500, between 500 and 1500, between 1500 and 2500, or greater than 2500.\n");
        income = input.nextInt();

        taxWithHoldings = (income <= 499) ? income*tax[0] : 0;
        taxWithHoldings = ((income >= 500) && (income < 1499)) ? income*tax[1] : income*tax[0];
        taxWithHoldings = ((income >= 1500) && (income < 2499)) ? income*tax[2] : income*tax[1];
        taxWithHoldings = (income >= 2500) ? income*tax[3] : income*tax[2];

        takeHomePay = (income <= 499) ? (income-(income*tax[0])) : income;
        takeHomePay = ((income >= 500) && (income <= 1499)) ? (income-(income*tax[1])) : (income-(income*tax[0]));
        takeHomePay = ((income >= 1500) && (income <= 2499)) ? (income-(income*tax[2])) : (income-(income*tax[1]));
        takeHomePay = (income >= 2500) ? (income - (income*tax[3])) : (income-(income*tax[2]));

        System.out.println("Weekly tax withholdings : "+ taxWithHoldings +"\nTake home pay is: "+takeHomePay);
    }
}