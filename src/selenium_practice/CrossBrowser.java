package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser 
{
	static WebDriver driver;
	@Parameters("Browser")
	@Test
	public static void launchApp(String browser) 
	{
		if (browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\NEW\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}else if(browser.equals("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", "");
			driver=new ChromeDriver();
		}else if(browser.equals("IE"))
			
		{
			
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://www.cricbuzz.com/live-cricket-scores/50949/rsa-vs-ind-3rd-t20i-south-africa-tour-of-india-2022");
		driver.close();
		
	}

}
