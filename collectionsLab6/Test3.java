package collectionsLab6;

//Create a method which accepts an array of numbers and
//returns the numbers and their squares in Hashmap

import java.util.HashMap;
import java.util.Map;

public class Test3 {
	
//	static void getSquares(int[] arr)
	static Map<Integer, Integer> getSquares(int[] arr)
	{
		HashMap<Integer,Integer> mp = new HashMap<>();
		for(int i : arr)
		{
//			mp.put(arr[i],(int)Math.pow(arr[i], 2));
			mp.put(i, i*i);
		}
//		
//	for(Map.Entry<Integer, Integer> ent : mp.entrySet())
//	{
//		System.out.println(ent.getValue());
//	}
//		
		return mp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 2, 3, 5};
		System.out.println(getSquares(arr));
		

	}

}
