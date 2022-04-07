package datatypesPractice;

public class DataTypePractice1 {

	public static void main(String[] args) {
		int d=add(20,30);
		System.out.println(d);
		int e=add(50,50);
		System.out.println(e);
	
		float c= areaOfCircle(20);
		System.out.println(c); 
		
		int f= add2(1,2,3);
		System.out.println(f);
		
		int m=add2(3,2,1);
		System.out.println(m);
		
		float o= areaOfCircle(12);
		System.out.println(o);
		
		
	}
	
	static int add(int a,int b) {
		int c;
		c = a + b;
		return c;
	}
		
		
	static float areaOfCircle(float r) {
			float a;
			a=(float) (3.14*r*r);
		    return a;
	}
   
	static int add2(int a,int b,int c) {
		int d;
		d=a+b*c;
		
		return d;
	}
}
