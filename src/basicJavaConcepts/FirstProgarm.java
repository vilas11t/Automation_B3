package basicJavaConcepts;

public class FirstProgarm {
	static int i;
	{
		i++;
		System.out.println(" objects no "+i);
	
	}

	public static void main(String[] args) {
		System.out.println("Hello");
		FirstProgarm o1=new FirstProgarm();
		FirstProgarm o2=new FirstProgarm();
		FirstProgarm o3=new FirstProgarm();
		o1.m1();
	}
	
	void m1() {
		FirstProgarm o4=new FirstProgarm();
	}
}
