package practice;

public class CountEvenOdd {

	public static void main(String[] args) 
	{
		int Num=655645678;
		int even=0;
		int odd=0;
		int rem;
		while(Num>0)
		{
			rem=Num%10;
			
			if (rem%2==0)
			{
				even++;
			
			}else
			{
				odd++;
				
			}
			Num=Num/10;
			
		}
		System.out.println("EVEN numbers are :"+even    +   " Odd numbers are:" +odd);
	}

}
