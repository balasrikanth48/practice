package practice;

public class CountCharacterOccurence {

	public static void main(String[] args) 
	{
		String str="java Program Java oops";
		int totalcount=str.length();
		String str1=str.replaceAll("a", "");
		System.out.println(str1.length());
		
		int count=totalcount-str1.length();
		System.out.println(count);
		
	}

}
