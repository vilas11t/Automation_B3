package polymorphism;

public class Test1 {
	
	
	static void m1() {
		System.out.println("method without para");
	}
	private void m1(int a) {
		System.out.println("method with one parameter");
	}
	
	final void m1(float a) {
		System.out.println("method with one parameter of char");
	}
	
	int m1(int a,int b) {
		System.out.println("method with 2 parameters");
		return a+b;
	}
	
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.m1();
		
		t1.m1(10f);
		
		t1.m1('a');
		
		int c=t1.m1(10, 20);
		System.out.println(c);
		
		
	}
	
	

}
