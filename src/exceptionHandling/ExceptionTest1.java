package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest1 {
	
	public static void main(String[] args) throws FileNotFoundException {
		readFile();
	}
	
	static void readFile() throws FileNotFoundException{
		File f=new File("C:\\Users\\Vilas\\Automation_Project_B3\\Automation_B3\\demoFile.txt");
		Scanner sc=new Scanner(f);
		
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
	}

}
