package basicJavaConcepts;

public class StaticKeyword {
	// static keyword
	// 1. it can be used with method, variables,objects, blocks
	// 2. class per copy.
	// 3. Memory is allocated while loading class.
	
	static int a; // class per copy
    int b; // instance variable,  object per copy
	
	static MethodPractice methodPractice;
	
	public static void main(String[] args) {
		StaticKeyword obj1=new StaticKeyword();
		StaticKeyword obj2=new StaticKeyword();
		StaticKeyword obj3=new StaticKeyword();
		
		obj1.b=20;
		obj2.b=30;
		obj3.b=40;
		
		System.out.println(obj1.b); // 20
		System.out.println(obj2.b); //30
		System.out.println(obj3.b); //40
		
		
		obj1.a=20;
		obj2.a=30;
		obj3.a=40;
		
		System.out.println(obj1.a); // 40
		System.out.println(obj2.a); //40
		System.out.println(obj3.a); //40
		
		methodPractice=new MethodPractice();
		
		System.out.println(methodPractice.factorial(5));
	}

}
