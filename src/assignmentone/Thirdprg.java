package assignmentone;

import java.util.Scanner;

public class Thirdprg {

	public static void main(String[] args) 
	{
		int a,o,b,d,c;
	
	System.out.println("enter any  3 digit number");
	Scanner r2=new Scanner(System.in);
	a=r2.nextInt();
	o=a;
	b=a%10;
	a=a/10;
	c=a%10;
	a=a/10;
	d=a%10;
	if(o==((b)+(c*10)+(d*100)))
			System.out.println("Armstrong number");	
	else
		System.out.println("not a Armstrong number");
	
}
}
