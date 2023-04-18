package bag_interface.s1_bags;

public class Test {

	public static void test() {
		System.out.println("Create an empty bag with capacity of 5");
		FixedCapacityBag<String> bag = new FixedCapacityBag<>(5);
		System.out.println("Bag: " + bag.toString());
		System.out.println("Add the item: book");
		bag.add("book");
		System.out.println("Bag: " + bag.toString());
	}
	/*
	 * Main methods performing all tests.
	 * @param args - not used
	 */
	public static void main(String[] args) {
		test();
	}
}
