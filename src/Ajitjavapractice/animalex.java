package Ajitjavapractice;

public class animalex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.eat();
		obj.cat();
	}
	}
    class a {
	public void eat() {
		System.out.println("dog eat pedgree");	
}	
}
    class B extends a{
	public void cat() {
		System.out.println("cat eat milk");
}
}
     