package practice;

public class SerchInArray {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,50,40};
		
		int Search_ele=60;
		boolean flag= false;
		
		
		for (int i = 0; i <a.length; i++) 
		{
			if (Search_ele==a[i])
			{
				System.out.println("Element found  :"+ i);
				flag=true;
				break;
			}
		}
		if (flag==false)
		{
			System.out.println("Element not Found ");
		}

	}

}
