package collectionPractice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
	/*
	 MAP- Key-value pairs
	 
	  - Key- must be unique, values may have duplicates
	  
	  Map- interface
	   
	  HashMap
	  LinkedHashMap
	  TreeMap-
	 
	  
	 */
	
	public static void main(String[] args) {
		Map<Integer, String> studentData=new HashMap<Integer, String>();
		
		studentData.put(1, "Kedar");
		studentData.put(2, "rohit");
		studentData.put(3, "rahul");
		studentData.putIfAbsent(2, "abc");
		System.out.println(studentData);
		
		
		
	}
}
