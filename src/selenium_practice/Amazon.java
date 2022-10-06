package selenium_practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException

	{

		System.setProperty("webdriver.chrome.driver", "D:\\NEW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		WebElement nextpage = driver.findElement(By.xpath("//i[@class='a-icon a-icon-next-rounded']"));
		WebElement prePage = driver.findElement(By.xpath("//i[@class='a-icon a-icon-previous-rounded']"));

		
		List<WebElement> banner = driver.findElements(By.xpath("//li[@class='a-carousel-card']/div/div/a/div/img"));
		List<WebElement> url = driver.findElements(By.xpath("//li[@class='a-carousel-card']/div/div/a"));
		
		for (int i = 0; i < banner.size(); i++) 
		{
			if (banner.get(i).getAttribute("alt").equals("realme narzo 50"))
			{
				url.get(i).click();
			}else
			{
				Thread.sleep(3000);
				nextpage.click();
			}
		}
	}

}
