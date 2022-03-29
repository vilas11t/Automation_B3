package basicJavaConcepts;

public class WhileLoopPractice {

	//while
	
	public static void main(String[] args) {
		int i=0;
		
		while(i<100) {
			System.out.println(i);
			i=i+10;
		}
		
		
		// do-- while
		int j=1;
		
		do {
			System.out.println("Value of j :"+j);
			j=j+1;
		}while(j<1);
	}
}
