package stringLab3;

public class Lab3Ex3 {
	static boolean isVowel(char ch)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
            && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O'
            && ch != 'U') {
            return false;
        }
        return true;
    }
	
	static String altString(String str)
	{
		char[] ch = str. toCharArray();
		for(int i=0;i<ch.length;i++)
		{

			 if (!isVowel(ch[i])) {
				 
	                // if character is z,
	                // than replace it with character b
	                if (ch[i] == 'z') {
	                   ch[i] = 'b';
	                }
	                if(ch[i] == 'Z') {
	                	 ch[i] = 'B';
	                }
	                else {
	                	 
	                    // replace the element with
	                    // next immediate alphabet
	                    ch[i] = (char)(ch[i] + 1);
	 
	                    if (isVowel(ch[i])) {
	                        ch[i] = (char)(ch[i] + 1);
	                    }
	                }
			 }
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Srirupa";
		System.out.println(altString(s));

	}

}
