package bag_interface.s1_bags;

import java.util.Iterator;
/* @author Eric Newman
 * A fixed capacity bag. The capacity may be specified when the bag is created
 * and cannot be changed.
 * @param <Item> the type of the elements stored in the bag
 */

public class FixedCapacityBag<Item> implements Bag<Item> {

	/*
	 * The array of elements stored in the bag.
	 */
	private final Item[] elements;
	
	/*
	 * The current number of elements sorted in the bag.
	 */
	private int numberOfElements;
	/*
	 * Creates an empty bag with the given capacity
	 * @param capacity - the maximum amount in the bag
	 */
	@SuppressWarnings("unchecked")
	public FixedCapacityBag(int capacity) {
		elements = (Item[]) new Object[capacity];
		numberOfElements = 0;
	}

	@Override
	public Iterator<Item> iterator() {
		return new Iterator<Item>() {
			int index = 0;

			@Override
			public boolean hasNext() {
				return index < numberOfElements;
			}

			@Override
			public Item next() {
				if(hasNext()) return elements[index++];
				throw new RuntimeException("No more elements.");
			}
	};
}
	@Override
	public String toString() {
		String result = "[";
		for(int i = 0; i < numberOfElements; i++) {
			result += elements[i].toString() + " ";
			result += "] \n";
			return result;
		}
	@Override
	public void add(Item item) {
		if(numberOfElements == elements.length)
			throw new RuntimeException("Bag is full");
		elements[numberOfElements] = item;
		numberOfElements++;
	}

	@Override
	public boolean isEmpty() {
		return (numberOfElements == 0);
	}

	@Override
	public int size() {
		return numberOfElements;
	}
	}
}
