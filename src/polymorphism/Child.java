package polymorphism;

public class Child extends Parent {
	
	void m1() {
		System.out.println("method m1 in child class");
	}
	
	public static void main(String[] args) {
		Parent p=new Parent();
		Child c=new Child();
		Parent pc=new Child();
		
		p.m1();
		c.m1();
		pc.m1();
	}

}
