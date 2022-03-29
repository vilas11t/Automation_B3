package abstraction;

public class Reactangle extends Test1 implements Shape,Shape1 {

	@Override
	public double area() {
		float b=5,l=10;
		return b*l;
	}

	@Override
	public int volume() {
		int b=10,l=10, h=50;
		return b*l*h;
	}
	
	@Override
	public void decription() {
		System.out.println("This is a Reactangle shape");
	}
	
	

}
