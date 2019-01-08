/**
 * 
 * LinkedList class I made while learning Java
 * 
 * Currently, it can only make integer lists
 * 
 * @author Ryan Letto
 *
 */
public class LinkedList {
	
	//first node in the list
	private node head;	
	//last node in the list
	private node tail;
	//total number of nodes in the list
	private int totalNodes;			
	
	
	
	/**
	 * Accessor for totalNodes
	 * @return total number of nodes in the list
	 */
	int getTotalNodes() { return totalNodes; };
	
	
	/**
	 * LinkedList constructor that creates an empty list
	 */
	public LinkedList() {
		//There are initially no nodes in the empty list, so everything gets set to 0 and null, respectively
		head = null;
		tail = null;
		totalNodes = 0;
	}
	
	
	
	
	/**
	 * adds an element to the list
	 * @param val	The value to be added to the list
	 */
	public void add(int val) {
		if (head == null) {		//Exception for if the list has not been filled to create the head
			head = new node(val);		//Create a new node
			tail = head;				//Set tail to head, which is currently the first and last node in the list
		}
		else {					//Condition for adding a node if the head has already been created
			tail.next = new node(val);	//Create a new node at the current tail for the new value
			tail = tail.next;			//Update the tail to be the new last node
		}
		totalNodes++;					//Increment total nodes by 1
	}
	
	
	
	
	/**
	 * Prints the entire LinkedList to console
	 */
	public void print() {
		node temp = head;	//Temporary reference variable to store node addresses
		for (int i = 0; i < totalNodes; i++) {	//For loop to go through the LinkedList
			System.out.printf("%d ", temp.val);	//Print the value and then a space
			temp = temp.next;					//Update the temporary variable
		}
		System.out.println("");					//Print a newline at the end
	}
	
	
	
	
	/**
	 * Deletes last node in the linked list and also returns the old value
	 * 
	 * @modifies	- the tail will update to reflect the new changes
	 * 				- the total nodes variable decreases by 1
	 * @return the value from the last element in the list
	 */
	public int pop_off() {
		int value = tail.val;	//Save the old value in a variable

		node temp = head;		//Temp node used for getting to the second last element in the list
		for (int i = 0; i < totalNodes - 1; i++) {	//For loop to go through the list to the second last node
			temp = temp.next;					//Update the temporary variable
		}
		temp.next = null;		//Make this second last element the last one in the list by setting the next to null
		tail = temp;			//Update the tail
		totalNodes--;			//Reduce the total nodes
		return value;
	}
	
	
	
	
	/**
	 * private node class to be used within the LinkedList class
	 */
	private class node {
		
		/**
		 * Constructor to create a node
		 * @param value	The value to be stored in the node
		 */
		public node(int value) {
			val = value;	//Set the node value
			next = null;	//This next should be representing the last node on construction
		}
		
		//node value
		public int val;
		//next node in the list
		public node next;
	}
}
