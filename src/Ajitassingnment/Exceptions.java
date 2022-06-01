package Ajitassingnment;

import java.util.Scanner;

public class Exceptions  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a=0;
    int b=0;
    int c=0;
    try{
    	System.out.println("Enter divident number :");
    	Scanner sc=new Scanner(System.in);
    	a=sc.nextInt();
    	System.out.println("Enter devisior number :");
    	b=sc.nextInt();
    	
    	c=a/b; 
    System.out.println("C="+c);
    }
    catch(Exception e) {
    	System.out.println("Please enter valid devisior");
    	
    }
    finally{
    	System.out.println("your operation is completed");
    }
   //System.out.println(c);
	}

}
