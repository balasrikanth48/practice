package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDrpGeneric 
{
	
	static WebDriver driver;
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement country=	driver.findElement(By.xpath("//select[@id='input-country']"));
		SelectOptionfromDropdwon(country, "Colombia");
		
	}
	
	public static void SelectOptionfromDropdwon(WebElement ele , String value)
	{
		Select drpdwn=new Select(ele);
	
		List<WebElement> drop= drpdwn.getOptions();
		
		for (WebElement Option : drop) 
		{
			if(Option.getText().equals("Colombia"))
			{
				Option.click();
				break;
			}
		
	}
	
	}
}