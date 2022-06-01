package Ajitjavapractice;

public class metodex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
getSquare(4,5);
getEven(5);
getFact(4);
	}
	public static void getSquare(int a,int b) {
		int number= a * b;
		
		System.out.println("the square of given no is : " + number);
	}
public static void getEven(int num) {
	if(num%2==0) {
		System.out.println("even no : " + num );
	}
	else {
		System.out.println("odd no: " + num);
	}
	}
public static void getFact(int factnum) {
	int fact = 1;
	
	for(int i=1;i<=factnum;i++) {
		fact=fact*i;	
	}
	System.out.println("factorial no is: " + fact);
}
}

