package selenium_practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		 int Brokenlinks=0;
		for (WebElement elemenet : links) 
		{
			String url= elemenet.getAttribute("href");
			
			 
			if (url==null||url.isEmpty()) 
			{
				System.out.println("URL is empty");
				continue;
				
			}
			URL link=new URL(url);
			try {
				
				HttpURLConnection httpcon= (HttpURLConnection) link.openConnection();
				httpcon.connect();
				if (httpcon.getResponseCode()>=400)
				{
				 System.out.println(httpcon.getResponseCode()+url+ "  is"+ "Broken links");	
				 
				
				Brokenlinks++;
				 
				}
				else
				{
					System.out.println(httpcon.getResponseCode()+url+ "  is"+ "Valid links");

				}
				
			} catch (Exception e) 
			{
					
			}
			
		}
       System.out.println("Total no of  Broken Links ="+Brokenlinks);
	}

}
