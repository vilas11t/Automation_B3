package Ajitassingnment;

public class stringex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Selenium Testing";
		System.out.println(str.length());
		System.out.println(str.charAt(1));
		System.out.println(str.equals("Selenium"));
		String []StrArray= str.split("");
		System.out.println(StrArray[0]);
		System.out.println(str.indexOf('g'));
		System.out.println(str.contains("Selenium Testing"));
	}

}