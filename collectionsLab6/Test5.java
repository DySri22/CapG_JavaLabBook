package collectionsLab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//converting Array into ArrayList and finding secondSmallestElement
//Here we are removing the duplicate element by taking another list 
public class Test5 {
	
	static int getSecondSmallest(Integer arr[])
	{
		List<Integer> l1 = Arrays.asList(arr);
//	    Set<Integer> s = new LinkedHashSet<>();//creating a set for removing all the duplicate values
//	    s.addAll(l1);//adding all the elements of list to set
//	    l1.clear();
//	    l1.addAll(s); //adding all the elements of set without duplicates
//		
//		
	    System.out.println(l1);
	    
	    ArrayList<Integer> newlist = new ArrayList<>();
	    for(Integer it : l1)
	    {
	    	if(!newlist.contains(it)) {
	    		newlist.add(it);
	    	}
	    }
	    Collections.sort(newlist);
	    int element=newlist.get(1);
        return element;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer a[]= {1,5,6,2,3,4,5};
		System.out.println(getSecondSmallest(a));
//		getSecondSmallest(a);

	}

}
