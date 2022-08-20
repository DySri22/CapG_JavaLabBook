package flowControlOplab1;

public class lab11 {
	
	public static void findCube(int n)
	{
		int sum=0;
		int temp;
		if(n!=0)
		{
			temp=n%10;
			sum+=Math.pow(temp, 3);
			n/=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findCube(12);

	}

}
