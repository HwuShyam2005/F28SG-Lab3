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
	 * TODO Where N is the number of elements in the stack the complexity is:
	 *
	 * O(?)
	 * 
	 * @param o the integer to add to the top of the stack
	 */
	public void push(int o) {
	    // Create a new node with value o, and set its next node to the current top
	    Node newnode = new Node(o, top);
	    
	    // Set the top reference to the new node (making it the new top)
	    top = newnode;
	    
	    // Increment the size of the list (since a new element has been added)
	    size++;
	}

	public int pop() throws StackException {
	    // Checking if the stack is empty
	    if (isEmpty()) {
	        // If empty, throw a StackException
	        throw new StackException("Stack is Empty");
	    } else {
	        // If not empty:
	        
	        // Create a temporary variable and store the value of the top element in it
	        int temp = top.getValue();
	        
	        // Change the top reference to the next node (simulating popping)
	        top = top.getNext();
	        
	        // Decrement the size of the stack
	        size--;
	        
	        // Return the value of the popped item
	        return temp;
	    }
	}

	public int top() throws StackException {
	    // Checking if the stack is empty
	    if (isEmpty()) {
	        // If empty, throw a StackException
	        throw new StackException("Stack is Empty");
	    } else {
	        // If not empty:
	        
	        // Create a temporary variable and store the value of the top element in it
	        int temp = top.getValue();
	        
	        // Return the top value
	        return temp;
	    }
	}
}

	