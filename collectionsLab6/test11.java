package collectionsLab6;

//Create a method which accepts a hash map and
//return the values of the map in sorted order as a List.

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class test11 {
	
	static List getValues(HashMap<Integer,Integer> mp)
	{
		List<Integer> list1 = new ArrayList<>();
		for(int n : mp.values())
		{
			list1.add(n);
		}
		Collections.sort(list1);
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> values = new HashMap<>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many entries you want??");
		n=sc.nextInt();
		System.out.println("Enter key and The value pairs:");
		for(int i=0;i<n;i++) {
			
			int k = sc.nextInt();
			int v = sc.nextInt();
			
			values.put(k,v);
		}
		System.out.println(getValues(values));
	}

}
