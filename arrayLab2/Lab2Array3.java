package arrayLab2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Lab2Array3 {
	
	public static Integer[] getSorted(TreeSet<Integer> int_arr)
	{
		int size = int_arr.size();
		Integer arr[] = new Integer[size];
		arr = int_arr.toArray(arr);
		
		for(int i=0; i<size; i++)
		{
			String val = String.valueOf(arr[i]); //converting integer array to string array
			String rev_val = new StringBuilder(val).reverse().toString(); //String builder for reversing elements then converting it into string
			arr[i] = Integer.parseInt(rev_val); // again storing as integer value
		}
		
		Arrays.sort(arr);
		return arr;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> int_arr = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int number = sc.nextInt();
			int_arr.add(number);
		}
		int size = int_arr.size();
		Integer result_arr[] = getSorted(int_arr);
		
		System.out.println("Array after Reversing the number and Soretd are as follows: ");
		for(int i: result_arr)
			System.out.print(i + "  ");
		
		sc.close();
	}

}
