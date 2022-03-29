package abstraction;

public class Shine extends Bike {
	
	
	Shine(){
		super();
	}
	

	@Override
	int speed() {
		System.out.println("Shine bike speed is 120 km/h");
		return 120;
	}

	@Override
	int gears() {
		System.out.println("Shine bike has 5 gears");
		return 5;
	}
	
	@Override
	void companyName(String cName) {
		System.out.println("Company name is"+cName);
	}

	void m1() {
		super.a=20;
		super.b=10;
		System.out.println("This is shine bike method");
	}
	
}
