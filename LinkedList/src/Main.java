/**
 * Test code for the Linked List I built
 * @author Ryan Letto
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Creating a new linked list");
		LinkedList test = new LinkedList();	//Create new LinkedList object
		
		System.out.println("Trying to print the empty list to console, no values should print");
		test.print();		//Print list to console
		
		System.out.println("Now adding 5 to the list and printing again, the value should show up");
		test.add(5);		//Add something to the list
		test.print();		//Print again to see if the change was updated
		
		//Add some more elements to the list
		//Also playing around with the formatted print command
		for (int i = -7; i < 0; i++)
		{
			System.out.printf("Adding %d to the list\n",i);
			test.add(i);
		}
		
		System.out.println("Printing the list after the additions");
		test.print();		//Print to see if the list updated
		
		System.out.println("Removing the last element of the list and reprinting the list");
		int lastVal = test.pop_off();	//Storing the last value in an attempt to print it
		System.out.println("The last value was " + lastVal);
		test.print();
		
		//Little test to see how object assignment works in Java
		LinkedList test2 = test;	//Creating a new LinkedList variable, but assigning it to the OLD one
		test2.add(1235);			//Adding a variable to the second list to make it different than the second one
		
		System.out.print("First list: ");
		test.print();
		System.out.print("Second list: ");
		test2.print();
		
		//Both list prints provide the same output, which shows that no copying is happening
		//Since both variables are linked to the same object
	}

}
