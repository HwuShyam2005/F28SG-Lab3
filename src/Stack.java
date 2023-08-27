class StackException extends RuntimeException{    
		public StackException(String err) {
			super(err);
		}
}

public class Stack implements StackADT {
	
	private class Node{
		int element;
		Node next;
		
		public Node(int e, Node n){
			element = e;
			next = n;
		}
		
		public int getValue() {
			return element;
		}
		
		public Node getNext() {
			return next;
		}
	}
	
	// this is a reference to the head node of the linked list
	private Node top;
	
	// keep track of the number of elements in the stack
	private int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int size(){
		return size; 
	}
	
	// part 3: complete
	/** Adds a new element to the stack
	 * 
	 * @param o the integer to add to the top of the stack
	 */
	public void push(int o){

	}
	
	// part 3: complete
	/** Removes an element from the top of the stack
	 * 
	 * @return the integer that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public int pop() throws StackException{
		return -1; // dummy remove
	}
	
	// part 3: complete
	/** Returns the integer at the top of the stack
	 * 
	 * @return the integer at the top of the stack
	 * @throws StackException is the stack is empty
	 */
	public int top() throws StackException{
		return -1; // dummy remove
	}
	
	
	

}
