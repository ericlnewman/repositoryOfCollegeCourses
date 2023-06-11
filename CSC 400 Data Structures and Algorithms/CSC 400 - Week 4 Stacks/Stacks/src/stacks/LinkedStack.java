package stacks;

public class LinkedStack<T> implements StackInterface<T>{
		private Node<T> topNode;

		public LinkedStack() {
		topNode = null;
		} // end constructor
		
		@Override
		public void push(T newEntry) {
			Node<T> newNode = new Node<T>(newEntry);
			newNode.setNextNode(topNode);
			topNode = newNode;
		} // end push (performs at O(1))

		@Override
		public T peek() {
			T top = null;
			if(topNode != null)
				top = topNode.getData();
				return top;
		} // end peek
		
		@Override
		public T pop() {
			T top = peek();
			if(topNode != null)
				topNode = topNode.getNextNode();
			return top;
		} // end pop (performs at O(1))

		@Override
		public boolean isEmpty() {
			return topNode == null;
		} // end isEmpty

		@Override
		public void clear() {
			topNode = null;
		} // end isEmpty
	}