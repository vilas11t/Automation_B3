package exceptionHandling;

import java.nio.file.FileAlreadyExistsException;

public class ExceptionPractice {
	/*
	 Exception
	 
	 it is event when occure that disturbs normal flow of execution of program.
	 
	 Reasons
	 - Opening non existing file.
	 - index used out of range
	 -End user input mistake.
	 -network connection problem.
	  etc
	 
	 Types 
	  - Checked / compile time
	  - unchecked / runtime
	  - errors
	  
	  Checked- checked by compiler
	          example- IOException,ClassNotFountException, FileNotFoundException
	          
	  unchecked- not checked by compiler, came at run time.
	             ex- Arithmetic exception,ArrayIndexOutOfBoundException,
	             NumberFormatException.
	  
	  Error- ocurs due to lack of system resources
	       ex- StackOutOfFlowError, OutOfMempryError.
	       Error is an unchecked exception
	       
	  How to handle exception.
	  
	  -try-- catch
	  -throws
	  
	  
	  -try-- catch -- finally
	  
	    try{
	        // possibility of exception
	    }catch(Exception e){
	      e.getMessage();
	    }
	        
	          
	          
	          In catch block to display exception we can use three methods
	          1.getMessage()- description 
	          2.toSTring()- exception type and description
	          3.printstacktrace()- exception type, description and class name with line number where exception came.
	          
	          
	         H.W.
	         1. what is diff between throws and throw
	         2. what is diff between final, finally and finalize.
		 
		 Only checked exceptions are required to be thrown using the throws keyword. 
		 Unchecked exceptions don’t need to be thrown or handled explicitly in code.
	 
	 */
	
	
	public static void main(String[] args) {
		int a=10;
		int c=0;
		int d=2;
		
		try {
			
		c=10/0;
		
		}
		catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("This is catch block");
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		finally {
			System.out.println("This is finally block statement");
		}
		
		
		
		System.out.println("value of C:="+c);
		System.out.println("Rest of code");
	}
	
	
	
	
	

}
