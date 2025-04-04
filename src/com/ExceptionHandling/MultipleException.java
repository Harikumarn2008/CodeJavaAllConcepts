package com.ExceptionHandling;

public class MultipleException {

	public static void main(String[] args) {
	
	try {
		
		int a = 0;
		int b = 2;
		int c = b/a;
		System.out.println(c);
			
		} 
	catch(ArithmeticException a) {
		System.out.println("Don't divide a number by a zero");
		}
	catch(NullPointerException n) {
		System.out.println("null point exc eption");
	}
	catch (Exception e) {
		System.out.println("Write a correct program");
	}
	
	/*finally {
		System.out.println("Muthu");
	}
	*/
	
	//we can use try catch block inside the finally block
	finally {
		try {
			System.out.println("Muthu");
		}
		catch(NullPointerException nullpoint) {
			System.out.println("null pointer exception");
		}
	}

	}

}
