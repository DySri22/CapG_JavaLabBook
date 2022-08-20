package flowControlOplab1;

public class Lab17 {
	
	public static void isIncreasing(int num)
	{
      boolean flag = false;
      int currentDigit = num % 10;
      num = num/10;

     
      while(num>0){
          if(currentDigit <= num % 10){
              flag = true;
              break;
          }

          currentDigit = num % 10;
          num = num/10;
      }

      if(flag){
          System.out.println("Digits are not in increasing order.");
      }else{
          System.out.println("Digits are in increasing order.");
      }
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isIncreasing(123453);

	}

}
