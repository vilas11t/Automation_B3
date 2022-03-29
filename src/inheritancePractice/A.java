package inheritancePractice;

public class A  {
	
	/*
	 1. Acquiring properties(variables and methods) of one class to another class
	 2. implemented using extends keyword
	 3. reduce code length and reusability of code
	 4. multiple inheritance is not supported by java. But it can be implemented using interface.
	 5. By default Object is parent class of class in java. java.lang
	 6. super keyword is used to point object parent class.(this is used to pint  object of current class )
	 7.Object creating- 
	      Parent p=new Parent();
	      Child C=new Child();
	      Parent pc=new Child();- 
	      Child C=new Parent(); -Not applicable  Child class can not hot parent class object
	 8.final class can not be inheritate
	 */
	
	void m1() {
		System.out.println("This is method1 of class A");
	}
	
	 void m2() {
		System.out.println("Thsi is method2 of class A");
	}
	
}
