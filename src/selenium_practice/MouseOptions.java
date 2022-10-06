package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOptions {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//	    WebElement button=	driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
//		Actions act=new Actions(driver);
//		act.contextClick(button).perform();
		 //Double Click
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		WebElement doubleclick=	driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
//		Actions act=new Actions(driver);
//		act.doubleClick(doubleclick).perform();
		
		//Drog and Drop
		
//		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		WebElement rome= driver.findElement(By.id("box6"));
//		
//		WebElement ilty= driver.findElement(By.id("box106"));
//		Actions act=new Actions(driver);
//		act.dragAndDrop(rome, ilty).perform();
		
		//drag and drop imag
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement img1= driver.findElement(By.xpath("//li[1]"));
		WebElement img2= driver.findElement(By.xpath("//li[2]"));
		
		WebElement trash=	driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(img1, trash).perform();
		act.dragAndDrop(img2, trash).perform();
		
		
		
		
		
		
	}

}
