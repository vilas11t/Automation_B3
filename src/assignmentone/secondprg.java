package assignmentone;
import java.util.Scanner;

public class secondprg {

	public static void main(String[] args) {int a;
		System.out.println("enter any number");
		Scanner r1=new Scanner(System.in);
		a=r1.nextInt();
		int flag=0;
		for(int i=2;i<a;i++)
			{
				if((a%i)==0)
					{
						flag=1;
						break;
					}
			
			}
		if (flag==1)
		{
			System.out.println("not prime  number");
		}
		else
		{
			System.out.println("prime  number");
		}

}
}
