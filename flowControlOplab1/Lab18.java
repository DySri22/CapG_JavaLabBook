package flowControlOplab1;

public class Lab18 {
//	public static boolean powerOfTwo(int n)
//	{
//	while(n%2==0)
//	{
//	n=n/2;
//	}
//	if(n==1)
//	{
//	return true;
//	}
//	else
//	{
//	return false;
//	}
//	}
	
	public static boolean powerOfTwoBitwise(int n)
	{
	  return (n & n-1)==0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		powerofTwo(81);
//		powerofTwo(12);
		if(!powerOfTwoBitwise(7))
		{
			 System.out.println("Not Power of two");
		}
		else
		{
			 System.out.println("Power of two.");
		}
		powerOfTwoBitwise(7);
		powerOfTwoBitwise(91);
		powerOfTwoBitwise(121);
		powerOfTwoBitwise(4);
		
		
	}

}
