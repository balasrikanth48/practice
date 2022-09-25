package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//1.select sepcific checkbox
		
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		//2. Select all the check box
		
	   List<WebElement> checkbox=	driver.findElements(By.xpath("//input[@type='checkbox'  and contains(@id, 'day')]"));
	
	 /*  for (int i = 0; i < checkbox.size(); i++) 
	   {
		checkbox.get(i).click();
		
	   }*/
	   
	/*   for (WebElement chkbx : checkbox) 
	   {
		chkbx.click();
		
	   }*/
	   
	   //3. select multiples by choice
	   
	 /*  for (WebElement Chkbox : checkbox)
	   {
		   String day= Chkbox.getAttribute("id");
		   if (Chkbox.equals("monday")||Chkbox.equals("sunday")) 
		   {
			Chkbox.click();
		}*/
	   
	   //4. last two check boxes --total no of check boxes-no of check box want to select =Strting index
	  //7-2=5
	   
	  int totalchckbox=checkbox.size();
	  /* for (int i = totalchckbox-2; i <totalchckbox; i++) 
	   {
		checkbox.get(i).click();
	   }*/
	   
	  //to select from starting
	   for (int i = 0; i <totalchckbox; i++) 
	   {
		 if (i<2) 
		 {
			checkbox.get(i).click();
		}
    	}
		   
		   
	}
}
