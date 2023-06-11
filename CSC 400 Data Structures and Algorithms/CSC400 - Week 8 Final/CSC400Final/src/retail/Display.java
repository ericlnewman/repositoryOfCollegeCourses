package retail;
import java.util.Queue;
import java.util.Comparator;

class Display {
    private Order[] nameOrders;
    private Order[] numberOrders;

    // Display constructor
    public Display(Queue<Order> orders) {
        sortArrays(orders);
    }

    /**Sort the queue by firt creating two arrays, using collectsions toArray, then using the comparator class determine the elements
     *  of the arrays in descending value (i.e. Z-A) and (10 - 0) and then use the quicksort to prefrom the correct order
     */
    public void sortArrays(Queue<Order> orders) {
        nameOrders = orders.toArray(new Order[0]);
        numberOrders = orders.toArray(new Order[0]);

        Comparator<Order> compareLastName = (x, y) -> y.getLastName().compareTo(x.getLastName());
        Comparator<Order> compareOrderNumber = (x, y) -> Integer.compare(y.getOrderNum(), x.getOrderNum());

        quickSort(nameOrders, compareLastName, 0, nameOrders.length - 1);
        quickSort(numberOrders, compareOrderNumber, 0, numberOrders.length - 1);
    }

    /** print to console */
    public void printPurchase() {
        System.out.println("\nOrders by Name\n");
        for(Order order : nameOrders){
            System.out.println("Name: " + order.getLastName() + ", Order Number: " + order.getOrderNum() + ", Order cost: " + order.getCost() + "\n");
        }
        System.out.println("\n\nOrders by Order Number\n");
        for(Order order : numberOrders){
            System.out.println("Name: " + order.getLastName() + ", Order Number: " + order.getOrderNum() + ", Order cost: " + order.getCost() + "\n");
        }
    }

    /**Quick sort algorithim to sort the queue with comparator */
    private void quickSort(Order[] array, Comparator<Order> comparator, int first, int last) {
        if (first < last) {
            int pivotIndex = divide(array, comparator, first, last);

            // Recursive call
            quickSort(array, comparator, first, pivotIndex - 1);
            quickSort(array, comparator, pivotIndex + 1, last);
        }
    }
    // divide the array
    private int divide(Order[] array, Comparator<Order> comparator, int first, int last) {
        int pivotIndex = firstMiddleLast
        (array, comparator, first, last);
        exchange(array, pivotIndex, last);

        int i = first - 1;
        for (int j = first; j <= last - 1; j++) {
            if (comparator.compare(array[j], array[last]) <= 0) {
                i++;
                exchange(array, i, j);
            }
        }
        exchange(array, i + 1, last);
        return i + 1;
    }

    private int firstMiddleLast(Order[] array, Comparator<Order> comparator, int first, int last) {
        int middle = first + (last - first) / 2;

        // Compare and exchange the first, middle, and last to find the median of three
        if (comparator.compare(array[first], array[middle]) > 0) {
            exchange(array, first, middle);
        }
        if (comparator.compare(array[first], array[last]) > 0) {
            exchange(array, first, last);
        }
        if (comparator.compare(array[middle], array[last]) > 0) {
            exchange(array, middle, last);
        }

        return middle;
    }

    private void exchange(Order[] array, int i, int j) {
        Order tempArray = array[i];
        array[i] = array[j];
        array[j] = tempArray;
    }
}