package food;

public class ShoppingCart<MyType> implements BagInterfaceMyType<MyType> {

	private MyType[] myBag;
	private int numberofProducts;
	private static final int Default_Capacity = 25;
	private static final int MAX_CAPACITY = 10000;
	// private boolean initialized = false;
	/* *creates default constructor with an empty bag with an
	 * initial capacity of 25 */
	public ShoppingCart(){
		this(Default_Capacity);
	} // end default constructor
	
	// Constructor for ShoppingCart to initialize bag
	public ShoppingCart(int numofProducts) {
		if (numofProducts <= MAX_CAPACITY){	
		@SuppressWarnings("unchecked")
			MyType[] temp = (MyType[]) new Object[Default_Capacity];
			myBag = temp;
	} else {
		throw new IllegalStateException("Attempted to create a bag that exceeds allowed limit");
		}
	}// end ShoppingCart constructor
	/*private void checkInitialized() {
		if(!initialized) {
			throw new SecurityException("Bag is not initialized properly.");
		} // end if
	} // end checkInitialized
	*/
	@Override // used to add a new entry
	public boolean add(MyType newBag) {
		//checkInitialized();
		boolean result = true;
		if(isFull()) {
		result = false;
		} else { // assertion that result is true.
			myBag[numberofProducts] = newBag;
            numberofProducts++;
		} // end if
	return result;
	} // end add
	
	@Override // provides an array of the allocated bag
	public MyType[] toArray() {
		// the cast is safe because the new array contains null entries
		@SuppressWarnings("unchecked")
		MyType[] result = (MyType[]) new Object[numberofProducts];
		for(int i = 0; i < numberofProducts; ++i) {
			result[i] = myBag[i];
		} // end for
		return result;
	} // end toArray
	
	@Override	// get the current capacity of the bag
	public int getCurrentSize() {
		return numberofProducts;
	} // end getCurrentSize

	@Override // test whether the bag is at the maximum capacity.
	public boolean isFull() {
		return numberofProducts == myBag.length;
	} // end isFull
 }