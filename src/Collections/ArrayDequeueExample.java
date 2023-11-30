package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample {

	public static void main(String[] args) {
		Deque<String>dq= new ArrayDeque<String>();
		
		dq.add("Rick");
		dq.add("Maggie");
		dq.add("Glenn");
		dq.add("Negan");
		dq.add("Daryl");
		
		System.out.println("Elements in queue: "+dq);
		
		System.out.println("Remove elements: "+dq.removeLast());
		System.out.println("Head: "+dq.element());
		// poll() is used to remove 
		System.out.println("poll(): "+dq.pollLast());
		// peek() method - it works same as element() 
		// peekFirst() and peekLast()to retrieve first and last element
		System.out.println("peek(): "+dq.peek());
		
		System.out.println("elements in deque: "+dq);
		
	}

}
