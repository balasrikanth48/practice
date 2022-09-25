package practice;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String str="Selenium Programing    launague";
		str=str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
