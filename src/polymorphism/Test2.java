package polymorphism;

public class Test2 {
	
	static long add(long a, int b) {
		System.out.println("int-int");
		return a+b;
	}
	
	static long add(int a,long b){
		System.out.println("int-long");
		return a+b;
	}
	
	public static void main(String[] args) {
		// int+int= int
		// int+long-long
		
		add(10l,20);
		
	}
}
