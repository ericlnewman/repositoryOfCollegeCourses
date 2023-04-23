package stacks;

class Node<T>{
	private T data;
	private Node<T> next;
	
	Node(T dataPortion) {
		this(dataPortion, null);
	} // end constructor
	Node(T dataPortion, Node<T> nextNode) {
		data = dataPortion;
		next = nextNode;
	} // end constructor
	T getData() {
		return data;
	} // end getData
	void setData(T newData) {
		data = newData;
	} // end setData
	Node <T> getNextNode() {
		return next;
	} // end getNextNode
	public void setNextNode(Node<T> newNext) {
		next = newNext;
	} // end setNextNode
	
} // end Node