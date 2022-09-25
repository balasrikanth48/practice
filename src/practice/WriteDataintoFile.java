package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataintoFile {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("C:\\Users\\balas\\OneDrive\\Desktop\\srikanth.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Selenium with Java");
		bw.write("Srikanth");
		System.out.println("Finished");
		bw.close();
	}

}
