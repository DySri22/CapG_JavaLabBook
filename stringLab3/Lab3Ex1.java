package stringLab3;

import java.util.Scanner;
import java.util.StringTokenizer;
//Read a line of integer and display the sum using StringTokenizer Class

public class Lab3Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s," "); //tokenizing the current string with the delimiter " " space
	    while(st.hasMoreElements())
	    {
	    	String temp = st.nextToken(); //store the current token in temp
	    	n= Integer.parseInt(temp);  //converting the temp into integer
	    	sum+=n;
	    }
		System.out.println("The sum is : "+ sum);
		sc.close();

	}

}
