package exceptionHLab5;
import java.util.*;
//Exercise 2: Write a Java Program to validate the full name of an employee. 
//Create and throw a user defined exception if firstName and lastName is blank.
class InvalidNameException extends Exception
{
	
}
public class ExceptionQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First and Last name");
		String FirstName = sc.nextLine();
		String LastName = sc.nextLine();
		try
		{
			if(FirstName == "" ||LastName == ""  ||(FirstName == "" && LastName == ""))
			{
				throw new InvalidNameException();
			}
			else
			{
				System.out.println("Your name is :"+FirstName + " " + LastName);
			}
		}
		catch(InvalidNameException e)
		{
			System.out.println("Field can not be blank");
		}
		
		

	}

}
