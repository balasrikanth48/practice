package selenium_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortedDropdwon {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("");
		
		driver.findElement(By.id(""));
		
		WebElement drpEelement= driver.findElement(By.name(""));
		Select drpsele=new Select(drpEelement);
		
		List<WebElement> options= drpsele.getOptions();
		
		
		ArrayList  originallist=new ArrayList();
		
		ArrayList templist=new ArrayList();
		
		for (WebElement  option : options) 
		{
			originallist.add(option.getText());
			templist.add(option.getText());
		}
		
		
		System.out.println("Originallist :"+originallist);
		System.out.println("Temparary List :"+templist);
	
		Collections.sort(templist);
		
		
		if (originallist.equals(templist))
		{
			System.out.println("Dropdwon sorted");
		}else
		{
			System.out.println("Dropdown not sorted");
		}
		
		driver.close();
	}

}
