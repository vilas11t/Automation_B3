package assignmentone;
class P1
{
	void m1()
	{
		System.out.println("hello");
		
	}
	int m2()
	{
		int a=10;int b=20;
		System.out.println(a+b);
		return a+b;
		
	}
	void m3()
	{System.out.println("diff method");
}
}
class C extends P1
{void m1()
{
	System.out.println("hi");
	
}
int m2()
{
	int a=40;int b=20;
	System.out.println(a+b);
	return a+b;
	
}
}
public class overrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
P1 p1=new P1();
C c1=new C();
P1 s=new C();
p1.m1();
int b1=p1.m2();
c1.m1();
int b2=c1.m2();
s.m1();
int b3=s.m2();
s.m3();
	}

}
