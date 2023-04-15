import java.util.Scanner;


public class Bubble{

    public static  bubble(int[] numSort){

        Scanner in = new Scanner(System.in);
        int len;
        System.out.println("How many elements to put in?");
        len = in.nextInt();
        int[] numbers = new int[len];
        for(int i = 0; i < len; ++i){
            numbers[i] = in.nextInt(); // adding elements to array
        }
        for(int i = 0; i < len; ++i){
            for(int j = 1+i; j < len; j++)
            {
                if (numbers[i] > numbers[j]);
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;

            }
        }
  
    }
}


/*import java.util.ArrayList;
 * ArrayList<Interger> numbers = new ArrayList<Interger>();
 *       numbers.add(num);
        System.out.println("Done? Enter 'e'" );
        exit = in.nextLine();
        int len = numbers.size();
        } while(exit != "e");

        for(int i = 0; i < len; ++i){
            for(int j = i+1; j < len; ++j){
                if (numbers.get(i) > numbers.get(j)){
                int temp = numbers.get(i);
                numbers.get(i) = numbers.get(j);
                numbers.get(j) = temp;
                }
            }
        }
 */