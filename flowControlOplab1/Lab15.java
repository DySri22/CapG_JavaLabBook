package flowControlOplab1;

public class Lab15 {
	
	public static void natural(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
			
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The Sum is : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		natural(10);

	}

}
