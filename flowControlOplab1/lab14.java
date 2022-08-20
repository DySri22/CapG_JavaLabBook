package flowControlOplab1;

import java.util.*;

public class lab14 {
	
	public static boolean prime(int n)
	{
		for(int i=2;i*i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer");
		n = sc.nextInt();
		if(!prime(n))
		{
			System.out.println("Its not prime");
		}
		else
		{
			System.out.println("Its prime");
		}
	}

}
