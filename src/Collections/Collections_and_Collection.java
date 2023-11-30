package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_and_Collection {

	public static void main(String[] args) {
		// list 
		List list = new ArrayList();
		list.add("HCL");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("tech Mahindra");
		list.add(2,"zoho");
		list.set(1, "Imarticus");
		
		// Sorting list in ascending order according to the natural ordering

	//	Collections.sort(list);
		list.forEach((n)->System.out.println(n));
		// for(String str:list)
		//System.out.println(str);
		System.out.println(list.indexOf("Imarticus"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains("Hello"));
		list.clear();
		System.out.println(list);
	}

}
