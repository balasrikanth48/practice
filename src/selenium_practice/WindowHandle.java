package selenium_practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Admin123");
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
//		String windowid=driver.getWindowHandle();
//		System.out.println("window id  :"+windowid);
		
		driver.findElement(By.xpath("/a[text()='OrangeHRM, Inc']")).click();
		//First Methode
		
		Set<String> id= driver.getWindowHandles();	
	/*	Iterator<String> it=id.iterator();
		String parentid=	it.next();
		String childwi= it.next();*/
		
		//2nd Methode
		
		List<String>  windowidlist= new ArrayList<>(id);
//		String parentwindow=windowidlist.get(0);
//		String childwindowid=windowidlist.get(1);
//		System.out.println("Parent id  :"+parentwindow +"chaild windowid::"+childwindowid);
//		//how to use windows for switvhing
//		driver.switchTo().window(parentwindow);
//		System.out.println("Title :"+driver.getTitle());
//		driver.switchTo().window(child windowid);
//		
		//for each loop
		
		for (String wid : windowidlist) 
		{
			driver.switchTo().window(wid).getTitle();
		}
		
		driver.close();//Closes single browsing window 
		
		for (String wid : windowidlist) 
		{
		String title=	driver.switchTo().window(wid).getTitle();
			if (title.equals("Orange HRM"))
			{
				driver.close();
			}
		}
	}

}
