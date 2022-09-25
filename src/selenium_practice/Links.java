package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.linkText("Fresh"));
		
		//how to capture all the links
		
		List<WebElement>	links=driver.findElements(By.tagName("a"));
		
		//System.out.println("links are :"+ links.size());
		for (int i = 0; i <=links.size(); i++)
		{
			links.get(i).getText();
			links.get(i).getAttribute("href");
			
			
		}
		

	}

}
