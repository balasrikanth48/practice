package practice;

import java.util.Scanner;

public class Largestof3numbers {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the first Number");
		int a=scn.nextInt();
		System.out.println("enter the second Number");
		int b=scn.nextInt();
		System.out.println("enter the Third Number");
		int c=scn.nextInt();
		
		/*if (a>b && a>c) 
		{50
			System.out.println("A is the largest number :" +a);
		}
		else if (b>a && b>c)
		{
			System.out.println("B is the lergest number :"+b);
		}else
		{
			System.out.println("C is the Largest number :"+c);
		}*/
		//Ternery Operator
		
//		int largest=a>b?a:b;
//		 largest=c>largest?c:largest;
		
		
		int  largest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("lragest num :" + largest);

	}

}
