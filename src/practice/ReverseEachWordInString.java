package practice;

public class ReverseEachWordInString {

	public static void main(String[] args)
	{
		//Approch1
		/*String str="Welcome to Java";
		String[] words=str.split(" ");
		String reverseString = "" ;
		for (String w : words) 
		{
			String reversword = "";
			for (int i =w.length()-1 ; i>=0; i--)
			{
				reversword=reversword+w.charAt(i);
				
			}
			reverseString=reverseString+reversword +"  ";
			 
		}		
		
        System.out.println(reverseString);*/
		
		String str="Welcome to Java";
		String[] words=str.split("\\s");
		String reverseword="";
		for (String W : words)
		{
			StringBuilder sd=new StringBuilder(W);
			sd.reverse();
			reverseword=reverseword+sd.toString()+" ";
		}	
	System.out.println(reverseword);
	}

}
