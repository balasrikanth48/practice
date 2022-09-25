package selenium_practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
//		TakesScreenshot scr= (TakesScreenshot)driver;
//		File fl=scr.getScreenshotAs(OutputType.FILE);
//		File trg=new File("D:\\Srikanth_tester\\practice\\Screenshots");
//		FileUtils.copyfile(fl ,trg);
		
		//screenshot of a section
//		WebElement section= driver.findElement(By.xpath(""));
//		File fl=section.getScreenshotAs(OutputType.FILE);
//		File trg=new File("D:\\Srikanth_tester\\practice\\Screenshots");
		
		WebElement ele= driver.findElement(By.xpath("//a[@id='logo']"));
		File fl=ele.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\Srikanth_tester\\practice\\Screenshots\\log.png");
		FileUtils.copyFile(fl, trg);
		
		
		
	}

}
