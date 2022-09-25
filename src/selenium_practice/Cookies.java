package selenium_practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		Set<org.openqa.selenium.Cookie> cook= driver.manage().getCookies();
		System.out.println("size of cookies  :"+cook.size());
		
		Cookie cookieobj=new Cookie("MyCookie", "123456");
		 driver.manage().addCookie(cookieobj);
		 cook=driver.manage().getCookies();
		System.out.println("size of cookies  :"+cook.size());
		driver.manage().deleteCookieNamed("MyCookie");
//		driver.manage().deleteCookie(cookieobj);
		cook=driver.manage().getCookies();
		System.out.println(cook);
		
	}

}
