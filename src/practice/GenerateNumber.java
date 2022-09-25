package practice;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateNumber {

	public static void main(String[] args)
	{
//		Random ran= new Random();
//		int rand=	ran.nextInt(10);
//		System.out.println(rand);
		
		//Math class-Approch
		//System.out.println(Math.random());
		
		//Approch3-appache common -lang api
		String rand= RandomStringUtils.randomNumeric(5);
		System.out.println(rand);
	}

}
