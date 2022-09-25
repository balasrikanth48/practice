package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("")).size();
		System.out.println("tota no of Rows is  :" +rows);
		int col=driver.findElements(By.xpath("")).size();
		System.out.println("no of columns  :"+col);
		
		//3 retrive sepcific row and coloumn
			
		
	}

}
