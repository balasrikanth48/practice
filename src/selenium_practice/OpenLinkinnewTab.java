package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkinnewTab {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
//		String tab=	Keys.chord(Keys.CONTROL , Keys.RETURN);
//		
//		driver.findElement(By.linkText("Register")).sendKeys(tab);
		
		//it will open new tab in the same browser
		
//		driver.switchTo().newWindow(WindowType.TAB);
		//open new browser 
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.opencart.com/");
		
		
		

	}

}
