package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplated {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement SearchStore=driver.findElement(By.xpath("//input[contains(@id,'small-searchterms')]"));
		System.out.println("Display status  :"+SearchStore.isDisplayed());
		System.out.println("Enable status  :"+SearchStore.isEnabled());
		
		WebElement male=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		WebElement female=driver.findElement(By.xpath("//*[@id=\"gender-female\"]"));
		System.out.println("selected status  :"+ male.isSelected());
		System.out.println("Selected Status :"+female.isSelected());
		
		male.click();
		System.out.println("selected status  :"+ male.isSelected());
		
		driver.quit();
		
	}

}
