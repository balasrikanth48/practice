package selenium_practice;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_dynamic {
	// static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\NEW\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		List<WebElement> banner = driver.findElements(By.xpath("//li[@class='a-carousel-card']/div/div/a/div/img"));
		List<WebElement> url = driver.findElements(By.xpath("//li[@class='a-carousel-card']/div/div/a"));
		Actions action= new Actions(driver);
		for (int i = 0; i <=url.size(); i++) {
		
			
			url.get(0).click();
			
			
			
	
		}

	}

}
