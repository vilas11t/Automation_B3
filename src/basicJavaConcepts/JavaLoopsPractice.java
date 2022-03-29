package basicJavaConcepts;

public class JavaLoopsPractice {
	// Loops
	// for, while, do  while 
	// for each
	
	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) // 0,1,2,3,4,5,6,7,8,9,10 - 11 times
			System.out.println("Value of i in loop: "+i);
			
		
		// to print even no. from 1 to 1000
		
		for(int i=1;i<=1000;i++) {
			if(i%2==0)
				System.out.println(i);
		}
		
		//5,10,15---50
		// to print table of 5
		
		for(int i=5;i<=50;i=i+5) 
			System.out.println(i);
		
		
	}
	
	

}
