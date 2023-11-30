package Collections;

import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		
         alist.add("Steve");
         alist.add("Tim");
         alist.add("Lucy");
         alist.add("Pat");
         alist.add("Angela");
         alist.add("Tom");
         
         
       // displaying elements
         System.out.println(alist);
        // Removing "Steve" and "Angela"
         alist.remove("Steve");
         alist.remove("Angela");
         
         // displaying elements
         System.out.println(alist);
         
        // Removing third element with index value - pat
         alist.remove(2);
         // displaying elements
         System.out.println(alist);
         
         // interating elements which means display the elements
         for(String str:alist)
     	System.out.println(str);
         
       System.out.println("Number of elements in Arraylist: "+alist.size());
	}
	

}
