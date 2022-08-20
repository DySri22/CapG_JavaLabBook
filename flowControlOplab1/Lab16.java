package flowControlOplab1;

public class Lab16 {
	
	public static void diff(int n)
	{
		int sumosquare=0;
		int sum=0;
		double squareofsum;
		
		for(int i=1;i<=n;i++)
		{
			sumosquare+=Math.pow(i, 2);
		}
		
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		squareofsum=Math.pow(sum, 2);
		double diff1 = ( squareofsum -sumosquare);
		System.out.print(diff1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		diff(10);

	}

}
