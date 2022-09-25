package practice;

public class Palendram {

	public static void main(String[] args)
	{
		int num=545;
		int sum = 0, temp, qut;
		
		while(num>0)
		{
			qut=num%10;
			sum=(sum*10)+qut;
			num=num/10;
			temp=num;
			
		}
		System.out.println("palandrim is:"+ sum);

	}

//	public static void ReverseString(String[] args)
//	{
//		String rev="";
//		
//		String str="Srikanth";
//		int len=str.length();
//		for (int i = len-1; i>=0; i--)
//		{
//			rev=rev+str.charAt(i);
//			
//		}
//		System.out.println(rev);
//	}

}
