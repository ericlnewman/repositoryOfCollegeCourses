import java.util.Scanner;

 public class Handle{

    public static String getValueOne(Scanner in) throws Exception {
        System.out.println("Enter string: ");
        String value = in.nextLine();

      if(value != null && value.length() == 0){

        throw new Exception("Failure");

      } else{

        System.out.println("Success\n");

      }
      return value;
    }
    public static String getValueTwo(Scanner in) throws Exception {
      System.out.println("Enter string: ");
      String value = in.nextLine();
      
    if(value != null && value.length() == 0){

      throw new Exception("Failure");

    } else{

      System.out.println("Success\n");

    }
    return value;
  }
  public static String getValueThree(Scanner in) throws Exception {
    System.out.println("Enter string: ");
    String value = in.nextLine();
    
  if(value != null && value.length() == 0){

    throw new Exception("Failure");

  } else{

    System.out.println("Success\n");

  }
  return value;
}

    public static void main(String[] args){
        String stringValOne, stringValTwo, stringValThree;
        Scanner in = new Scanner(System.in);
        char end = '-';
        System.out.println("Enter three strings or else an error.\n");
        while(end != 'e'){
            try {
              stringValOne = getValueOne(in);
              stringValTwo = getValueTwo(in);
              stringValThree = getValueThree(in);
              System.out.print(stringValOne +", " +stringValTwo + ", and " +stringValThree+"\n");

              }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
             } 
      
            System.out.print("\nEnter any key ('e' if done): ");
            end = in.next().charAt(0);
      }
    }
 }