package practice;

public class ReverseString {

	 
	public static void Revserse (String[] args) 
	{
		String str="Srikanth";
		String Rev = "";
		char ch[]=str.toCharArray();
		
		
		for (int i = ch.length-1; i>=0; i--)
		{
			Rev+=ch[i];
			
		}
		System.out.println("Reverse of the String is:"+ Rev);
		//return Rev
		
		
		
		
		
	}
}
