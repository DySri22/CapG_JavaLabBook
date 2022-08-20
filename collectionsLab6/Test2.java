package collectionsLab6;

//Accepting the character array and counting the frequency of each character using map
//Create a method that accepts a character array and
//count the number of times each character is present in the array.
import java.util.HashMap;
import java.util.Map;

public class Test2 {
	
	static Map<Character,Integer> charCount(char[] ch)
	 {
		 HashMap<Character,Integer> charCount = new HashMap<>();
		 for(char c : ch)
		 {
			 if(charCount.containsKey(c))
			 {
				 charCount.put(c,charCount.get(c)+ 1);  //if character is present then increment its value by 1
			 }
			 else
			 {
				 charCount.put(c, 1);					// if character is not present then put 1 as its a value
			 }
		 }
		 
//		 for(Map.Entry<Character,Integer> ent : charCount.entrySet())
//		 {
//			 System.out.println(ent.getKey()+" "+ ent.getValue());
//		 }
		 return charCount;
	 }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch = {'p','c','r','p','q','c'};
		
		 System.out.println(charCount(ch));
		

	}

}
