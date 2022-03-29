package abstraction;

public abstract class Bike {
	int a=10;
	static int b=20;
	
	static {
		
	}
	
	Bike(){
		System.out.println("Bike astract class constructor");
	}
	void wheels() {
		System.out.println("Two wheels");
	}
	
	abstract int speed();
	abstract int gears();
    abstract void companyName(String cName);
	
	
}
