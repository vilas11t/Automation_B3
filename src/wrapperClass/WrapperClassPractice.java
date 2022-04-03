package wrapperClass;

public class WrapperClassPractice {
	/*
	  8 primitive- int char byte, 
	 
	  Wrapper Class- 8 wrapper classes for 8 primitive data types.
	   
	   Autoboxing-primitive into objects.
	   unboxing- Objects into primitive 
	   
	   
	   Interger,Byte,Long,Character,Float,Double,Boolean,Short.
	   
	    -Character - Character
	    -Boolean- Boolean
	    -Number-Byte,Integer,Float,Double.Short.
	    
	    HM- program
	  
	 */
	
	
	public static void main(String[] args) {
		
		//Autoboxing
		int a=20;
		Integer i=Integer.valueOf(a); // Explicitely 
		System.out.println(i);
		
		Integer c=a; // Implicitely
		
		//Unboxing
		Integer d=new Integer(40);
		Integer e=50;
		int x=d;
		System.out.println(x);
	}

}
