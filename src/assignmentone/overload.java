package assignmentone;

public class overload {int a=10;
void m1()
{
System.out.println("value="+a);

	}
int m1(int b) {
	a=b;
	System.out.println("value="+a);
	return a;
}void m1(char n) {

	System.out.println("value="+n);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
overload o=new overload();
o.m1();
o.m1('h');
int c=o.m1(100);System.out.println("value="+c);

	}

}
