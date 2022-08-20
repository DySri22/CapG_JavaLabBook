package stringLab3;

//create a method that returns the mirror image of the string
public class lab3Ex2 {

	static String getImage(String str)
	{
		StringBuffer sb =  new StringBuffer(str); //converting string to StringBuffer so that we can reverse it
//		sb.append(str);
		sb.reverse(); //Reversing the StringBuffer
		String str2 = sb.toString(); //converting string buffer to String
		String str3 = str +"|"+str2;
		return str3;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "EARTH";
		System.out.println(getImage(str));
	 
	}

}
