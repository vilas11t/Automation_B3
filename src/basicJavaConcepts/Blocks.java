package basicJavaConcepts;

public class Blocks {
	/*
	 Blocks
	 - instance block
	    - to write business logic 
	    - executed while creating object. just before constructor execution.
	    
	 - static block
	     -  to write business logic 
	     - execute while class loading, before main method.
	 
	 */
	
	Blocks(){
		System.out.println("This is constructor");
	}
	
	{
       System.out.println("Hello this instance block");
	}
	
	
	
	static {
		System.out.println("This is static block");
	}
	
	
	
	
	public static void main(String[] args) {
		Blocks obj1=new Blocks();
		
	}

}
