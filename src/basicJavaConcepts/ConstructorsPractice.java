package basicJavaConcepts;

public class ConstructorsPractice {
	
	ConstructorsPractice(){
		this(10);
		System.out.println("Constructor");
	}
	
	ConstructorsPractice(int a){
		this(20,30);
		System.out.println("var a="+a);
	}
	
	ConstructorsPractice(int a,int b){
		System.out.println("var a="+a+" b="+b);
	}
	
	
	public static void main(String[] args) {
		ConstructorsPractice obj1=new ConstructorsPractice();
		
		Student s1=new Student(1, "kedar", 71.5f);
		Student s2=new Student(2, "Rohan", 70f);
		Student s3=new Student(3, "robin", 80f);
		
		System.out.println(s1.id+" "+s1.Name+" "+s1.marks);
		System.out.println(s2.id+" "+s2.Name+" "+s2.marks);
		
	}
	
	

}
