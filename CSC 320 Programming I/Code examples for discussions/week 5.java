// import java.util.Vector;
import java.util.ArrayList;
public class Main {


  public static void main(String[] args){

    ArrayList<String> names = new ArrayList<String>();

        names.add("Bob");
        names.add("Jim");
        names.add("Mary");
        names.add("Tim");

        System.out.println("Size is: " + names.size());
        for(String name : names){ // enhanced loop same as for(int 1 = 0; i < name.size(); ++i)
        System.out.println("Name: "+ name);
        }
        names.remove(0);
        System.out.println("Size is: " + names.size());
        for(String name : names){
          System.out.println("Name: "+ name);
        }

  }

}
    
   /* int[] birthYear; // declare that birthYear is an int
    birthYear = new int[] {2016, 2018, 2020}; // initialize as an int array with the elements in the array

    String[] name = new String[3]; // declare name is a String and initialize
    name[0] = "Ben";   // another way to declare the elements
    name[1] = "Jerry";
    name[2] = "Tom";

    // as one line
    int[] birthYear = new int[]{2016, 2018, 2020};
    String[] name = new String[]{"Ben", "Jerry", "Tom"};

    // one dimensional array
    String[] array = new String[3];
   
    //two dimensional array
    int[][] array2D = new int[4][5]; // 2d array that can hold a maximum of 20 (4*5) elements of an int type

    //three dimensional array
    String[][][] array3D = new String[5][4][2]; //  3d array that can hold a maximum of 40 (5*4*2) elements of string type 
    
        // import java.util.ArrayList; ... can only be one dimension
    ArrayList<Integer> arrlist = new ArrayList<Integer>();

        // import java.util.Vector; ... this is more so legacy and has been replaced by arraylist
    Vector<String> vector = new Vector<>();




  int[][] arr2D = {
      {4, 3, 6, 7}, 
      {5, 7, 8, 1, 2}, 
  };

  char[][][] arr3D = {
    {
      {a, b, c, d}, 
      {e, f, g, h},
      {i, j, k, l}
    }, 
    { 
      {m, n, o, p}, 
      {q}, 
      {r, s}
    } */

/*  
    ArrayList<String> names = new ArrayList<String>();

        names.add("Bob");
        names.add("Jim");
        names.add("Mary");
        names.add("Tim");

 
    // removes the element by declaring the element position in the array.
        System.out.println("Size is: " + names.size()+"\n");
        for(String name : names){ // enhanced loop same as for(int 1 = 0; i < name.size(); ++i)
        System.out.println("Name: "+ name+"\n");
        }
        names.remove(0);
        System.out.println("Size is: " + names.size()+"\n");
        for(String name : names){
          System.out.println("Name: " + name+"\n");
        }
        names.remove(1);
        System.out.println("Size is: "+ names.size()+"\n");
        for(String name : names){
            System.out.println("Name: " +name+"\n");
        } */ 