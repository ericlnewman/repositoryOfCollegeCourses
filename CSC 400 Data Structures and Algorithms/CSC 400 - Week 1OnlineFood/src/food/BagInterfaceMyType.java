package food;

public interface BagInterfaceMyType<T> {
	
	/** Gets the current number of entries in this bag.
	@return the integer number of entries currently in the bag */
	public int getCurrentSize();
	
	/** Sees whether this bag is full.
	@return true if the bag is full, or false if not */
	public boolean isFull();
	
	/** Adds a new entry to this bag.
	@param newEntry the object to be added as a new entry
	@return true if the addition is successful, or false if not */
	public boolean add(T newEntry);
	
	/** Creates an array of all entries that are in this bag.
	@return a newly allocated array of all the entries in the bag */
	public T[] toArray();
} // end
