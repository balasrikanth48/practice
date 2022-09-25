package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\NEW\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		/*WebElement search=driver.findElement(By.xpath("(//input[@id='small-searchterms']"));
		search.sendKeys("ABC");
		
		WebElement ele=driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(ele.getText());
		//List<WebElement > list=	driver.findElements(By.xpath("//div[@class='footer-upper']//a"));*/
		
		List<WebElement> link= driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(link.size());
		for (WebElement ele1 : link) 
		{
			System.out.println(ele1.getText());
		}
		
		/*List<WebElement> logo=	driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.size());*/
		

	}

}
