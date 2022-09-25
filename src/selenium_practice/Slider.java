package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement	min=driver.findElement(By.xpath("//span[1]"));
//		System.out.println("Location os min :" +min.getLocation());
		Actions act=new Actions(driver);
		act.dragAndDropBy(min, 100, 0).perform();
		
		WebElement	max= driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max, -100, 0).perform();
		
	}

}
