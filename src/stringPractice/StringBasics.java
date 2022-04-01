package stringPractice;

public class StringBasics {
	/*
	 String- sequence of characters
	 	      Welcome, Hello#, 123Hello#$%, Hello How are you.
	 - String is class in java.lang
	    it is a final.
	    
	    2 ways to declare string
	    1. String str="Welcome";
	    2. String str1=new String("Hello");
	    
	     1. String str="Welcome";
	        without new keyword - stored in SCP(String constant pool). 
	        String str1="Welcome"
	        String str2="Welcome" - separate memory will not allocate it will point to str1.
	        
	        String str3="Hello"
	        
	        
	    2. String str1=new String("Hello"); 
	        Separate memory will be allocated to each string.
	        String str1="Welcome"
	        String str2="Welcome"  Separate memory will be allocated to both string str1 and str2 
	      
	  - String is a immutable class
	     once string is created. It can not be modified.
	     
	   - StringBuilder and StrignBuffer.  
	     StringBuilder str1=new StringBuilder("Welcome");
	   
	    
	 
	 */
	
	
	public static void main(String[] args) {
		
		String str="Welcome";
		System.out.println(str);
		System.out.println(str.charAt(1));
		System.out.println("Substring:"+str.substring(2));
		System.out.println("Substring ="+str.substring(2, 5));
		System.out.println(str.substring(3,6));
		System.out.println(str.length());
	
		System.out.println(str.contains("come"));
		System.out.println(str.contains("wer"));
		System.out.println(str.indexOf('o'));
		
		int indexOfO=str.indexOf('o');
		
		System.out.println(str.indexOf("dgt"));
		
		System.out.println(str.equals("wel"));
		
		String str2="Hello How are You";
		String[] strArray=str2.split(" ");
		
		System.out.println(strArray[0]);
		reverseString(str);
		reverseWords(str2);
		
	}
	
	
	static void reverseString(String s) {
		// Welcome-  emocleW    // last index = length-1;
		
		for (int i = s.length()-1; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.print(" ");
		
	}
	
	
	static void reverseWords(String s) {
		
		String[] strArray=s.split(" ");
		System.out.println();
		for (int i = 0; i < strArray.length; i++) {
			reverseString(strArray[i]);
		}
		
		
		
	}
	

}
