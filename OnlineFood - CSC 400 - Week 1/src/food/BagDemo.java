package food;
public class BagDemo {

	public static void main(String[] args) {
		BagInterfaceMyType<String> order = new ShoppingCart<String>();
        String[] food = new String[]{"Lo Mien from Wang Palace, $12.5", "Wonton Soup from Wang Palace, $4.99", 
		"Sichuan Beef from Wang Palace, $8.75", "Big Mac from McDonalds, $3.99",
		"Happy Meal from McDonalds, $2.99"};

        addTestl(order, food);
    }
	private static void addTestl(BagInterfaceMyType<String> order, String[] food) {
		int len = food.length;
		System.out.println("\nAdding " + len + " orders to the cart");
		for(int i = 0; i < len; ++i) {
			order.add(food[i]);
			} // end for
		displayBag(order);
		} // end addTest
		

	private static void displayBag(BagInterfaceMyType<String> order) {
		Object[] arrayOne = order.toArray();
	    for (Object arrayTwo : arrayOne) {
	    System.out.println (arrayTwo + " ");
	    } // end for
	    System.out.println();
	} // end display
	
} // end BagDemo
