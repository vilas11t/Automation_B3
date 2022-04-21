package Ajitassingnment;

public class wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    stringtoint();
    inttostring();
    chartoint();
	}
	public static void stringtoint() {
		String str="20";
		Integer a=Integer.parseInt(str);
		System.out.println(a*a);
	}
public static void inttostring() {
	Integer a=60;
	String str=a.toString();
	System.out.println(str);
}
public static void chartoint() {
	char a='a';
	int b=a;
	System.out.println(b);
}
}
