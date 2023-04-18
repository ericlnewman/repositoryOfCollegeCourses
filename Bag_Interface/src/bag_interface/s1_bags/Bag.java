/**
 * Module 1 of Data Structure and Algorithms: Bags, Queues and Stacks.
 * Bags
 */
package bag_interface.s1_bags;
 
/**
 * @author Eric Newman
 * 
 * A bag is a data structure that collects and stores items in an unordered fashion. 
 * It allows for iterating over the items in the collection, but not for removing the items.
 * Operations are:
 * add(item)
 * isEmpty()
 * size()
 * @param <Item> the type of elements stored in the bag.
 */
public interface Bag<Item> extends Iterable<Item> {
	/*
	 * Adds the item to the bag. Duplicated items are allowed.
	 *  @param item An item to be added.
	 */
	public void add(Item item);

	/*
	 * Check if bag is empty.
	 * @return true for an empty bag, else false.
	 */
	public boolean isEmpty();
	/*
	 * The number of elements that are currently in the bag
	 * @return the size of the bag
	 */
	public int size();
}