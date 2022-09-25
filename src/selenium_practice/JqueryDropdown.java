package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropdown {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='justAnInputBox']"));
		
		 selectChoiceValues(driver, "choice 1");
		//selectChoiceValues(driver, "choice1","choice2");
		//selectChoiceValues(driver, "All");

	}
  
	
	public static void selectChoiceValues(WebDriver driver, String... value)
	{
		
		List<WebElement> choicelist= driver.findElements(By.xpath(""));
		if (!value[0].equalsIgnoreCase("all")) 
		{
			for (WebElement item : choicelist) 
			{
				String text=item.getText();
				for (String val : value)
				{
					if (text.equalsIgnoreCase(val))
					{
						item.click();
						break;
					}
					
				}
			}
		}
		else
		{
			for (WebElement item : choicelist)
			{
				item.click();
			}
			
		}
		
		
	}
}
