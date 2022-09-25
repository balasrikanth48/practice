package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver" ,"D:\\\\Chrome\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.google.com");
		//driver.findElement(By.className("M6CB1c rr4y5c")).click();
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnI']")).click();
		
		
		
	}

}
