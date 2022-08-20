package flowControlOplab1;

import java.util.Scanner;

public class Lab1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.next();
			switch(input)
			{
			case "red":
				System.out.println("Please Stop!!");
				break;
			case "yellow":
				System.out.println("Be Ready!!");
				break;
			case "green":
				System.out.println("Go...");
				break;
			default:
				System.out.println("Invalid Choice!!!");
				break;
			}	
		sc.close();

	}

}
