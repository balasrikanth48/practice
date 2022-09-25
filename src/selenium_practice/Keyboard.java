package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/key_presses");
		
		//Actions act =new Actions(driver);
//		act.sendKeys(Keys.ENTER).perform();
//		Thread.sleep(3000);
//		
//		act.sendKeys(Keys.BACK_SPACE).perform();
//		Thread.sleep(3000);
//		act.sendKeys(Keys.SPACE).perform();
		driver.get("https://text-compare.com/");
		WebElement input1= driver.findElement(By.xpath("//textarea[@id='inputText1']")); 
		WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		
		input1.sendKeys("Welcome to selenum");
		Actions act=new Actions(driver);
		//CTRL+A
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		if (input1.getAttribute("value").equals(input2.getAttribute("value")))
		{
			System.out.println("Text is copied");
		}else
		{
			System.out.println("Text not copied");
		}
		
	}

}
