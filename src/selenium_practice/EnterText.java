package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		WebElement  email=driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("balasrikanth48@gmail.com");
		System.out.println(email.getAttribute("value"));
		

	}

}
