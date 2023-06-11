import java.util.Scanner;

class Squared{
    
    int Square(int x){
        return x*x;
    }

    int SquareOfSum(int x, int y){

        int z = Square(x+y);
        return z;
    }
}
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Squared t = new Squared();
        int a;
        int b;
        System.out.println("Enter two numbers: ");
        a = in.nextInt();
        b = in.nextInt();

        int total = t.SquareOfSum(a,b);

        System.out.printf("Output: %d", total);
    }
}