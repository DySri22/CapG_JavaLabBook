package exceptionHLab5;
import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class ExceptionQ3 {
	
	static void salaryCheck(double salary)
	{
		try {
		if(salary<3000)
		{
			throw new EmployeeException("Invalid Salary");
		}
		System.out.println("Valid Salary");
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your salary : ");
		int salary = s.nextInt();
		salaryCheck(salary);

	}

}
