package flowControlOplab1;

public class lab12 {
	  public static int fib(int n)
	    {
	        if (n <= 1) {
	            return n;
	        }
	 
	        return fib(n - 1) + fib(n - 2);
	    }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		System.out.print(fib(n));

	}

}
