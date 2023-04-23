package retail;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Fields
        Order order = new Order();
        Display display = new Display(order.getOrder());
        Scanner in = new Scanner(System.in);
        int num = 0;
        String lastName = "";
        int orderNumber = 0;
        double cost = 0.0;

        // Display title
        System.out.println("Online Order Handler");

        while(num != 4){
            System.out.println("\nAdd Order, enter 1");
            System.out.println("Remove Order, enter 2");
            System.out.println("Display Orders by last name and order number, enter 3");
            System.out.println("Exit, enter 4");
            System.out.print("Enter number 1 - 4: ");

            num = in.nextInt();
            // switch case rather than if else for legibility
            switch (num) {

                case 1 :

                    lastName = in.nextLine();
                    System.out.println("Last name: ");
                    lastName = in.nextLine();
    
                    System.out.println("Order number: ");
                    orderNumber = in.nextInt();
                    in.nextLine();

                    System.out.println("Cost: ");
                    cost = in.nextDouble();

                    order.addPurchase(lastName, orderNumber, cost);
                    display.sortArrays(order.getOrder());
                    System.out.println("\nAdded.");

                break;
                
                case 2 :

                    System.out.print("Order number to remove: ");
                    orderNumber = in.nextInt();
                    in.nextLine();
                    order.removeOrder(orderNumber);
                    display.sortArrays(order.getOrder());
                    System.out.println("\nRemoved.");

                break;
               
                case 3 :

                    display.printPurchase();

                break;
                
                case 4:

                    System.out.println("\nGoodbye.");
                    break;
                
                default :

                    System.out.println("Invalid entry");

                break;
            }
        } in.close();
    }
}