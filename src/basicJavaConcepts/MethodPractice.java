package basicJavaConcepts;

public class MethodPractice {
	
	public static void main(String[] args) {
		
		MethodPractice obj1=new MethodPractice();
		int d=add(10, 20);
		System.out.println("Addition is:-"+d);
		System.out.println("Addition of digits of no. is="+obj1.addDigits(345));
		System.out.println("Factorial of a no="+obj1.factorial(5));
		
	}
	
	static int add(int a, int b) {
		int c;
		c=a+b;
		return c;
	}
	
	// program to add individual digits of no.
	// n=123 o/p - 6
	
	int addDigits(int n) {
		int r,add=0;
		while(n>0) {
			r=n%10;
			add=add+r;
			n=n/10;  
		}
		return add;
	}
	
	int factorial(int n) {
		// 5- 1*2*3*4*5= 120
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	void m1() {
		this.addDigits(3);
	}
	
	
}
