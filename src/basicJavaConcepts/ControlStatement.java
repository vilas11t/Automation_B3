package basicJavaConcepts;

public class ControlStatement {
	
	public static void main(String[] args) {
		//if
		//if  else
		// nested if else
		// if  else if 
		//switch
		
		/*
		 if(condition) {
		     stat1
		     stat2
		     
		     }
		     
		 rest of code    
		     
	   */
		
		int a=8;
		if(a%2==0)
		{ 
			System.out.println("even no");
			System.out.println("no is "+a);
			if(a%3==0) 
				System.out.println("Even not is divisible by 3 as well");
			else
				System.out.println("even no in no divisible by 3");
				
		}
		else {
			if(a%5==0) {
				System.out.println("odd no is divisible by 5");
			}
			System.out.println("No is odd");
			System.out.println(a);
		}
		
		System.out.println("Hello");
		
		
		
		
		
		
		
		
	}

}
