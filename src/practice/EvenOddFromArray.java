package practice;

public class EvenOddFromArray {

	public static void main(String[] args) 
	{
		int a[]= {1,5,7,6,2,4};
		
		/*for (int i = 0; i <a.length; i++) 
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
		for (int i = 0; i <a.length; i++) 
		{
			if (a[i]%2 !=0)
			{
				System.out.println(a[i]);
			}
		}*/
		 
		for (int v : a)
		{
			if(v%2==0)
			{
				System.out.println(v);
			}
		}
		}
		

}
