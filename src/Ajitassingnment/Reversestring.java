package Ajitassingnment;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String Name="Ajit is handsome";
    char str[]=Name.toCharArray();
    String reverse=""; 
    for(int i=str.length-1;i>=0;i--){
    reverse+=str[i];	
    	
    }
    System.out.println(reverse);
	}

}
