package Ajitassingnment;

public class Wrapperclassex {

	public static void main(String[] args) {
		stringtoint();
		inttostring();
		chartoint();
		inttochar();
	}
		// TODO Auto-generated method stub
    static void stringtoint() {
    	String str= "16";
    	Integer a= Integer.parseInt(str);
    	System.out.println(a+a);
    }
	static void inttostring() {
		Integer a=12;
		String str=a.toString();
		System.out.println(str);
	}
    static void chartoint() {
    	char w='5';
    	int c=Character.getNumericValue(w);
    	System.out.println(c+c);
    }
    static void inttochar() {
    	int d=7;
    	char x=(char)(d+'0');
    	System.out.println(x);
    }
}
