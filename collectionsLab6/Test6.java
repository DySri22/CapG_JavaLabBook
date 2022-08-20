package collectionsLab6;

//Create a method which accepts the id and the age of people as a Map 
//and decide if they are eligible for vote. A person is eligible for vote if his age is 
//greater than 18. Add the IDs of all the eligible persons to list and return the list. 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Test6 {
	
	static List voterList(HashMap<Integer,Integer> mp)
	{
		
		HashMap<Integer,Integer> mp1 = new HashMap<>();
		List<Integer> l1= new ArrayList<>();
		for(Map.Entry<Integer,Integer> ent : mp.entrySet())
		{
			if(ent.getValue() >=18)
			{
//				l1 = mp.keySet().stream().collect(Collectors.toCollection(ArrayList :: new));
				mp1.put(ent.getKey(), ent.getValue()); //putting those values and keys that satisfies the condition
				
			}
			
		}
		System.out.println(mp1); //printing the map
		l1 = mp1.keySet().stream().collect(Collectors.toCollection(ArrayList :: new));//converting the map keys into list
//		System.out.println(l1);
		return l1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		HashMap<Integer,Integer>hmap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Person :");
		n=sc.nextInt();
		System.out.println("Enter key and value pairs:");
		for(int i=0;i<n;i++)
		{
			Integer ID = sc.nextInt();
			Integer Age = sc.nextInt();
			
			hmap.put(ID,Age);
		}
		System.out.println(voterList(hmap));
		sc.close();

	}

}
