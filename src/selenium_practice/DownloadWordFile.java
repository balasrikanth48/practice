package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadWordFile {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://file-examples.com/index.php/sample-documents-download/");
		driver.findElement(By.xpath("//tbody//tr[1]//td[3]//a[1]")).click();
		
	}

}
