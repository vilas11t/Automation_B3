package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
	/*
	 Set- 
	    - insertion order in not preserved
	    -duplication is not allowed.
	    - only one null value
	    
	    Set- Parent interface
	    
	    Classes
	    HashSet- regular set. Hashing concept
	    
	    LinkedHashSet - it preserves Insertion order.
	    
	    TreeSet- ordered set- Elements are by default sorted in ascending order. 
	    
	    
	    diff between ArrayList and Set
	    
	           ArrayList                                        Set
	    1. Duplication is allowed                          Duplication is not allowed
	    2. multiple null values                            only one null value is allowed
	    3.insertion order is preserved                     insertion order in not preserved.
	    
	 */
	
	public static void main(String[] args) {
		//setPractice1();
		//linkedHashSetPractice();
		//treeSetPractice();
		SetMethodsPractice();
	}
	
	static void setPractice1() {
		// set declaration
		Set<String> set1=new HashSet<String>();
		HashSet<Integer> set2=new HashSet<Integer>();
		HashSet<Object> set3=new HashSet<Object>();
		
		set1.add("abc");
		set1.add("xyz");
		set1.add("mno");
		set1.add("rohit");
		
		set2.add(5);
		set2.add(70);
		set2.add(2);
		
		set3.addAll(set1);
		set3.addAll(set2);
		
		// set element display
		System.out.println("Set1:"+set1);
		System.out.println("Set2:"+set2);
		System.out.println("Set3:"+set3);
		
		//set element display using for each loop 
		
		System.out.println("set element display using for each loop: ");
		for(Integer i:set2) {
			System.out.println(i);
		}
		
		System.out.println("Object set element display using for each loop: ");
		for(Object i:set3) {
			System.out.println(i);
		}
		
		
		Iterator<String> itr=set1.iterator();
		System.out.println("set element display using Iterator:");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
	static void linkedHashSetPractice() {
		System.out.println("Linked hashSet: ");
		Set<String> set1=new LinkedHashSet<String>();
		set1.add("abc");
		set1.add("xyz");
		set1.add("mno");
		set1.add("rohit");
		System.out.println(set1);
	}
	
	static void treeSetPractice() {
		System.out.println("Treeset: ");
		Set<String> set1=new TreeSet<String>();
		set1.add("abc");
		set1.add("xyz");
		set1.add("mno");
		set1.add("rohit");
		System.out.println(set1);
	}
	
	static void SetMethodsPractice() {
		
		Set<String> set1=new HashSet<String>();
		HashSet<Integer> set2=new HashSet<Integer>();
		HashSet<Object> set3=new HashSet<Object>();
		
		set1.add("abc");
		set1.add("xyz");
		set1.add("mno");
		set1.add("rohit");
		
		set2.add(5);
		set2.add(70);
		set2.add(2);
		
		set3.addAll(set1);
		set3.addAll(set2);
		
		//contains();
		System.out.println("Contains method check: "+set1.contains("abce"));
		
		// containsAll
		System.out.println("ContainsAll method check: "+set3.containsAll(set2));
		
		// remove()
		set1.remove("abc");
		System.out.println("Remove method check: removed abc String:="+set1);
		
		// removeAll
		set3.removeAll(set1);
		System.out.println("Remove All method check: "+set3);
		
		// clear
		set2.clear();
		System.out.println("Set2:"+set2);
		
		
		
		
		
	}
	
	
	
}
