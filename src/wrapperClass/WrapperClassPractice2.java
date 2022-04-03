package wrapperClass;

public class WrapperClassPractice2 {
	
	public static void main(String[] args) {
		stringToInt();
		intToString();
		charToInt();
		intToChar();
	}
	
	/*
	  String to integer
	 */
	static void stringToInt() throws NumberFormatException {
		String str="20";
		Integer a=Integer.parseInt(str);
		System.out.println(a*a);
		System.out.println(str+str); //2020
	}
	
	//integer to String
	static void intToString() {
		Integer a=60;
		String str=a.toString();
		System.out.println(str+str); //6060
		
	}
	
	//char to int
	static void charToInt() {
		char a='5';
		int b=a;   // ASCII values
		int c=Character.getNumericValue(a); // int value
		System.out.println(b);
		System.out.println(c+c);  //10
	}
	
	//intToChar
	static void intToChar() {
		int a=5;
		char c=(char)(a+'0');
		System.out.println(c);
	}

}
