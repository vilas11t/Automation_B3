package Ajitassingnment;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> set1=new HashSet<String>();
    HashSet<Integer> set2=new HashSet<Integer>();
    HashSet<Object> set3=new HashSet<Object>();
      
    set1.add("Rahul");
    set1.add("Ajit");
    set1.add("Sagar");
    set1.add("Ajit");
    for(String i:set1) {
    	System.out.println(i);	
    }
    			 
    set2.add(19);
    set2.add(10);
    set2.add(16);
    System.out.println("Set2:"+set2);
    
    set3.add(set1);
    set3.add(set2);
    System.out.println("Set3:"+set3);
    
    System.out.println(set1.contains("abc"));
    set1.remove("Ajit");
    System.out.println(set1);
	}

}
