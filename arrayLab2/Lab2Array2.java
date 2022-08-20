package arrayLab2;

import java.util.TreeSet;

public class Lab2Array2 {
public static String[] sortStrings(TreeSet<String> arr) {
		
		int n = arr.size();
		String []str_arr = new String[n];
		str_arr = arr.toArray(str_arr);  //its a method to form an array of the same elements as the set
		
		if(n%2 == 0)   //if the size of the array is not odd
		{
			for(int i=0;i<(n/2); i++)
				str_arr[i] = str_arr[i].toUpperCase();
			for(int i=(n/2); i<n; i++)
				str_arr[i] = str_arr[i].toLowerCase();
		}
		else
		{
			for(int i=0;i<(n/2)+1; i++)
				str_arr[i] = str_arr[i].toUpperCase();
			for(int i=(n/2 + 1); i<n; i++)
				str_arr[i] = str_arr[i].toLowerCase();
		}
		
		return str_arr;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> str = new TreeSet<>();
		str.add("Hello");
		str.add("Nice");
		str.add("to");
		str.add("meet");
		str.add("you");
	
		String arr_result[] = sortStrings(str);
		
		for(String i: arr_result)
			System.out.print(i+ "  ");

	}

}
