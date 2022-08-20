package collectionsLab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

//School offers medals to students of 10th
//Use hashmap to get input from user
//If(Marks>=90) : Gold 
//If(Marks between 80 and 90) : Silver 
//If(Marks between 70 and 80) : Bronze 

public class Test4 {
                
	static HashMap<Integer,String> getStudents(HashMap<Integer,Integer>getmp)
 
	{
		HashMap<Integer,String>getmedal = new HashMap<>();
		for(Map.Entry<Integer, Integer> ent : getmp.entrySet())
		{
			if(ent.getValue() >= 90)
			{
				getmedal.put(ent.getKey(),"Gold");
//		 System.out.println(ent.getKey()+" "+ getmedal.values());
			}
			else if(ent.getValue() >=80 && ent.getValue() < 90)
			{
				getmedal.put(ent.getKey(),"Silver");
//				System.out.println(getmedal.values());
//				System.out.println(ent.getKey()+" "+ getmedal.values());
			}
			else if(ent.getValue() >=70 && ent.getValue() < 80)
			{
				getmedal.put(ent.getKey(),"Bronze");
//				System.out.println(getmedal.values());
//				System.out.println(ent.getKey()+" "+ getmedal.values());
			}

		}
//		System.out.println(getmedal);
		return getmedal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,Integer> student = new HashMap<>();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Student entries you want??");
		n=sc.nextInt();
		System.out.println("Enter key and The value pairs(100-70):");
		for(int i=0;i<n;i++) {
			
			int resID = sc.nextInt();
			int marks = sc.nextInt();
			
			student.put(resID, marks);
		}
		
		System.out.println(getStudents(student));
		sc.close();
	}

}
