package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		WebElement drp1=driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']"));
	
		drp1.click();
		List<WebElement> ProductType=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		selectoption(ProductType, "Accounts");
		
//		System.out.println(ProductType.size());
		
		/*for (WebElement Ptype : ProductType) 
		{
			if (Ptype.equals("Accounts"))
			{
				Ptype.click();
				break;
				
			}
		}*/
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> Products= driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']///li"));
		
		for (WebElement prod : Products)
		{
			if(prod.getText().equals("Salary Accounts"))
			{
				prod.click();
				break;
			}
		}
	}
	
	public static void selectoption(List<WebElement> options , String value)
	{
		
		for (WebElement option : options) 
		{
			if (option.getText().equals(value))
			{
				option.click();
				break;
				
			}
		 
	 }
	}

}
