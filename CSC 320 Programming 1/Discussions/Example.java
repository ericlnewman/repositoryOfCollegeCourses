import java.util.ArrayList;
public class Example {


  public static void main(String[] args){
    ArrayList<Double> num = new ArrayList<Double>();

    num.add(23.43);
    num.add(2.718);
    num.add(413.185);
    num.add(1.4);
    num.add(3.14);

    System.out.println("Size is: " + num.size()+ "\n");
    for(Double n : num){
        System.out.println("Number is: " + n+"\n");
    }
    double euler = 2.718;
    num.remove(euler);

    System.out.println("Size is: " + num.size()+ "\n");
    for(Double n : num){
        System.out.println("Number is: " + n+"\n");
    }


  }

}

 