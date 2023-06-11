import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
      String orig, reverse = "";
      Scanner input = new Scanner(System.in);
      orig = input.nextLine();
      int len = orig.length();
      for(int i = len -1; i >= 0; i--){
            Character.toLowerCase(orig.charAt(i));
         reverse = reverse + orig.charAt(i);}
         
         if(orig.equals(reverse)){
            System.out.println(orig + " is a palindrome");
         } else{
            System.out.println(orig + " is not a palindrome");
            }
      }
   }

