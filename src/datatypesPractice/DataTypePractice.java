package datatypesPractice;

public class DataTypePractice {
	public static void main(String[] args) {
	//Type casting
	// converting one data type into another is called type casting
	//1. automatic
	//2. manual
	//widening- smaller into larger
	//narrowing- larger into smaller
		
	//byte->short-char-int-long-float-double
	double d=10.20; // 8byte
	int a=(int)d;  // 4byte
		
	System.out.println(d);
	System.out.println(a);
	 
	// widening
	 
	int a2=10;
	double d2=a2;
	System.out.println(a2);
	System.out.println(d2);
	}
}
