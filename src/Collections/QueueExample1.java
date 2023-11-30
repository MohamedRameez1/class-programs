package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {

	public static void main(String[] args) {
		// We cannot create instance of a queue as it is on interface,
		// we can create instance of Linkedlist or priority Queue and assign it to Queue
		
		Queue<String> q = new  LinkedList<String>();
		
		// Adding elemenys to the queue
		q.add("Rick");
		q.add("Maggie");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");
		System.out.println("Elements in queue: "+q);
		// we can remove element from queue using remove()method
		// this would remove first element
		System.out.println("Remove element: "+q.remove());
		
		/* element(0 method- this returns the head of the queue. head is the first
		 * element of queue
		 */
		System.out.println("head: "+q.element());
		
		/* poll( method - this removes and returns the head of the queue.
		 * Returns null if the Queue is empty
		 */
		System.out.println("POLL(): "+q.poll());
		/* peek() method - it works same as element(
         method, however it returns null if the queue is empty
 	*/
		System.out.println("peek(: "+q.peek());
		System.out.println("Elements in queue: "+q);
	}

}
