package assignmentone;

import java.util.Scanner;

public class firstprg {

	public static void main(String[] args) {int a;int b=0;
		System.out.println("enter any number");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		b=a;
		for(int i=1;i<a;i++)
		{
			b=b*i;
		}
		System.out.println(b);
	}

}
