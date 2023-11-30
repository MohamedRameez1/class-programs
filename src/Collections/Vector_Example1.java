package Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Example1 {

	public static void main(String[] args) {
		// vector of initial capacity(size) of 2
		Vector<String>vec = new Vector<String>(2);
		
		// Adding element to a vector
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		
		// check size and capacity increment
		System.out.println("size is:" +vec.size());
		System.out.println("Default capacity incerement is: "+vec.capacity());
		
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		
		// size and capacity increment after two insertions
		System.out.println("size after addition: "+vec.size());
		System.out.println("Cpacity after addition: "+vec.capacity());
		
		// Display vector elements
		Enumeration<String> en = vec.elements();
		System.out.println("\nElements are: ");
		while(en.hasMoreElements())
			System.out.println(en.nextElement()+" ");
					

	}

}
