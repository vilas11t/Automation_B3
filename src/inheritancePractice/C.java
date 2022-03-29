package inheritancePractice;

public class C extends B{
void m1() {
	System.out.println("Method m1 in Class C");
 }
 public static void main(String[] args) {
	 A a=new C();
	 a.m1();
	 a.m2();
}

}
