package collectionsLab6;

//Create a method which accepts an integer array,
//reverse the numbers in the array and returns the resulting array in sorted order
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test7 {
	static void getSorted(Integer arr[])
	{
		String[] strArr=new String[arr.length];
//		for(int i=0;i<arr.length;i++)  //converting integer array into string array
//		{
//			strArr[i]=String.valueOf(arr[i]);
//		}
		//converting string array into list so that we can use reverse method
		
		List<Integer> list2 = Arrays.asList(arr);
		Collections.reverse(list2); //now we can reverse the initial list
		//now have to sort the list
		System.out.println(list2);
		Collections.sort(list2,Collections.reverseOrder());
//		for(String val : list2)
//		{
			System.out.println(list2);
//		}
		
         
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = { 9,7,1,6,55,13,12,3,4};
		getSorted(a);
		

	}

}
