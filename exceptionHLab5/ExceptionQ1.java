package exceptionHLab5;

//Validate the age of a person and display proper message by using user defined exception. 
//Age of a person should be above 15.

import java.util.Scanner;

class AgeException extends Exception {

	public AgeException(String str) {
		System.out.println(str);
	}
}

public class ExceptionQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = s.nextInt();

		try {
			if (age <= 15)
				throw new AgeException("Invalid age");
			else
				System.out.println("Valid age");
		} catch (AgeException a) {
			System.out.println(a);
		}
		s.close();
	}
}
