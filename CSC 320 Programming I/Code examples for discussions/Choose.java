import java.util.Scanner;

public class Choose{

    class Bubble{
    void BubbleInt(int[] array){
        int len = array.length;
        for(int i = 0; i < len; ++i){
            for( int j = 1+i; j < len; ++j){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        } 
    }
    void BubbleWord(String[] array){ 
        int len = array.length;
        for(int i = 0; i < len; ++i){
            for(int j = 1+i; j < len; ++j){
                if(array[i].compareTo(array[j]) > 0){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        } 
    }
    void printArray(int[] array){
        int len = array.length;
        for (int i=0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
    void printArrayw(String[] array){
        int len = array.length;
        for (int i=0; i<len; ++i){
                System.out.print(array[i] + " ");
            }

    }
}
    }
    public static void main(String[] args){
        Bubble b = new Bubble();
        Scanner in = new Scanner(System.in);
        System.out.println("Is the input words or numbers?");
        System.out.println("If word type 'word', if numbers type 'num' ");
        String userInput = in.nextLine();
        if (userInput == "word"){

            System.out.println("How many elements for the array? ");
            int len = in.nextInt();
            String[] wArray = new String[len];
            for(int i = 0; i < len; ++i){
                System.out.print("Enter word: ");
                wArray[i] = in.nextLine();
            }
            b.BubbleWord(wArray);
            b.printArrayw(wArray);
        }
        else if(userInput == "num"){
            System.out.println("How many elements for the array? ");
            int len = in.nextInt();
            int[] iArray = new int[len];
            for(int i = 0; i < len; ++i){
                System.out.print("Enter number: ");
                iArray[i] = in.nextInt();
            }
            b.BubbleInt(iArray);
            b.printArray(iArray);
        }
        else{
            System.out.print("Invalid entry");
        }
    }
}





/*
import java.util.Arrays;

String s = Arrays.toString(array);
        int bbln=Integer.parseInt(s); 
        return bbln;*/

/*String s = Arrays.toString(array);
        String bblw = System.out.print(s + " ");
        return bblw;
        
            }
    void AddNum(int[] array){
        int len = array.length;
        Scanner in = new Scanner(System.in);
       
    }
    void AddWord(String[] array){
        int len = array.length;
        Scanner in = new Scanner(System.in);
        len = in.nextInt();
       
    }
        
        
        */