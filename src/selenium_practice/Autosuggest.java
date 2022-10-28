 package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("sb_form_q")).sendKeys("Selenium");
	    List<WebElement> list=	driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
	    
	    
	    System.out.println("Size of autosuggest  "+  list.size());
		
		for (WebElement listitem : list) 
		{
			if (listitem.getText().equals("Selenium WebDriver"))
			{
				listitem.click();
				break;
				
			}
		}

	}

}
