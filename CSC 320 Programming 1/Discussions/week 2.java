import java.time.LocalDate;

public class age {

    public year(){

        int[] birthYear = new int[] {2016, 2018, 2020};

    }
    public name(){

        String[] name = new String[] {"Ben", "Tom", "Jerry"};
    }
    public currentYear(){

        LocalDate current_date = LocalDate.now();
        int currentYear = current_date.getYear();
    }
    public static void main(String[] args){

        int currentYear = new currentYear();

        int year = new year();

        Array name = new name();

        int a;
        int b;
        int c; 

        a = currentYear - birthYear[0];
        b = currentYear - birthYear[1];
        c = currentYear - birthYear[2];

        System.out.println(name[0] + "is " + a);
        System.out.println(name[1] + "is "+ b);
        System.out.println(name[2] + "is "+ c);
    }
}

