package polymorphism;

public class PolymorphismBasic {
	/*
	  polymorphism- Ability to take more forms 
	  
	  1.static/ compile time/method overloading
	  2.dyanamic/runtime/method overriding
	  
	  1. method overloading
	     - same class having more than one methods with same name but different parameters. 
	     - 1. number of parameters are diff
	          m1(int a);
	          m1(int a int b)
	       2. same parameters with diff datatype
	          m2(char c)
	          m2(int c)
	          
	    - method overloading does not consider return type
	    - we can overload static,private,final,abstract.
	     - byte->short->int->long->float->double
	             char
	 
	
	
	2. Method overriding
	   
	  - Same method present in parent and child class.
	  - same return type, same name, same parameters(count and data type).
      -can not override- private,static,final.
      - access modifies- remains same or we can increase scope but can not decrease.
         Parent       child
         public        public
         private       private method can not overrride
         protected     protected, public
         default       default, protected,public
       - We can change return type based on co-variant concept.
          if parent class method return Parent object then child class method can return 
           either parent class object or child class object.
           
       - When parent class method does not fulfill the requirement of child class then child 
         class can create its own method with same name but diff implementation.
           
           Real time example
           
           Class Bank{
              
              int rateOfInterest(){
              return x;
              }
           }
           
           Class SBI extends Bank{
              
              int rateOfInterest(){
              return y;
              }
           
           }
           
            Class BOI extends Bank{
              
              int rateOfInterest(){
              return z;
              }
           
           }
           
           
          - Exception handling in method overriding 
          
          
          abstraction
          encapsulation
          Exception
          wrapper classes
          collection.
       
	  */
	
	
	
	
	
	
	
	

}
