package abstraction;

public class Test2 {
	
	public static void main(String[] args) {
		Shape shape=new Reactangle();
		Double area=shape.area();
		
		System.out.println(area);
		
		System.out.println(shape.volume());
		shape.decription();
		
	}

}
