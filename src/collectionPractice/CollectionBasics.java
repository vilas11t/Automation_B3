package collectionPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionBasics {
	/*
	 Collection- Group of individual objects as single entity.
	 
	 Collection-Interface
	 Collections-Class
	 
	 1.List
	 2.Set
	 3.Map.
	 
	  1.List
	 
	 ArrayList
	     - Duplication is allowed.
	     -Insertion order is preserved.
	     - we can have multiple null elements.
	     
	     ArrayList                                                    Array
	  1. Growable in nature                                       Fixed in size
	  2. Heterogeneous                                            Homogeneous
	  3. implemented based on some standard data structure        Not implemented based on some standard data structure   
	  4. inbuilt methods support is available                     inbuilt methods support is not available
	  
	  
	  
	 */
	
	
	// ArrayList
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		ArrayList<Integer> intList=new ArrayList<Integer>();
		
		list.add("Kedar");
		list.add("rahul");
		list.add("rohit");
		list.add("rahul");
		list.add(null);
		list.add(null);
		
		intList.add(45);
		intList.add(8);
		intList.add(78);
		
		
		
		System.out.println(list);
		
		
		// for loop
		System.out.println("for loop");
		for (int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//for each loop
		System.out.println("for each loop");
		for(String str:list) {
			System.out.println(str);
		}
		
		// iterator
		Iterator<String> itr=list.iterator();
		System.out.println("iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
