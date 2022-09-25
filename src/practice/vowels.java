package practice;

public class vowels {

	public static void main(String[] args) {
		String str="Welcome";
		int count = 0;
		for (int i = 0; i <str.length(); i++) 
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e')
			{
				count++;
				System.out.println(" VOWELS are at:"+ i);
				
			}else
			{
				System.out.println("No VoWELS");
			}
		}
		System.out.println("count of VoWELS::-->" + count);

	}

}
 