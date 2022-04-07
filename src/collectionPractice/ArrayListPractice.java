package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList();
	}
	
	static void ArrayList() {
		List<Object> list=new ArrayList<Object>();
		
		List<String> list1=new ArrayList<String>();
		
		
		list1.add("rohit");
		list1.add("nikhil");
		
		list.add(1);
		list.add("String");
		list.add('c');
		
		
		// to add all element of one arraylist to another arraylist
		list.addAll(list1);
		System.out.println(list);
		
		//To sort arraylist in ascending order
		Collections.sort(list1);
		System.out.println(list1);
		
		//To sort arraylist in descending order
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
		
		// to convert from arraylist -> Array
		Object[] strArray=list1.toArray();
		System.out.println(strArray[0]);
	}
	
	

	
}
