package arrayLab2;

import java.util.Arrays;
import java.util.Scanner;

public class Lab2array4 {
	public static int removeDuplicateElements(int arr[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[n-1];  
        return j;  
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
//		Arrays.sort(arr,Collections.reverseOrder());
//		reverse(arr);
		int length = removeDuplicateElements(arr,n);
		for(int i=0;i<length;i++)
		{
//			System.out.print(arr[i]+" ");
		}

	}

}
