package practice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromText {

	public static void main(String[] args) throws IOException 
	{
		//Aproch1
		
		/*FileReader fr=new FileReader("C:\\Users\\balas\\OneDrive\\Desktop\\Capgamini.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		
		while((str=br.readLine())!= null)
		{
			System.out.println(str);
		}
		br.close();*/
		
		File file=new File("C:\\\\Users\\\\balas\\\\OneDrive\\\\Desktop\\\\Capgamini.txt");
		Scanner sc=new Scanner(file);
		/*while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();*/
		//aproch3
		
		sc.useDelimiter("\\Z");
		
		System.out.println(sc.next());
	}

}
