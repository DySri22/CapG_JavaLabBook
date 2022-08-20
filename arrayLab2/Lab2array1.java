package arrayLab2;
import java.util.*;
public class Lab2array1 {
	
	public static void secondSmall(int arr[])
	{
		int first, second, arr_size = arr.length;
		if (arr_size < 2)
        {
            System.out.println(" Invalid Input ");
            return;
        }
		first = second = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            /* If current element is smaller than first
              then update both first and second */
            if (arr[i] < first)
            {
                second = first;
                first = arr[i];
            }
 
            /* If arr[i] is in between first and second
               then update second  */
            else if (arr[i] < second && arr[i] != first)
                second = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                               "smallest element");
        else
            System.out.println(" second Smallest" +
                               " element is " + second);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=  new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		secondSmall(arr);
	}

}
