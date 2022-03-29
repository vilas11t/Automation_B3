package inheritancePractice;

public class B extends A {
	
	void m3() {
		System.out.println("This is class B method12");
	}

	void m4() {
		System.out.println("This is class B method13");
	}
	void m1() {
		System.out.println("Class B Method1");
	}
	
	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		A ab=new B();
		
		ab.m1();
		
		a.m1();
		
		ab.m2();
		
	}
	
	
}
