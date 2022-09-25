package selenium_practice;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DesiredCapabilities {

	public static void main(String[] args) throws MalformedURLException
	{
	   ChromeOptions cop=new ChromeOptions();
	   cop.setCapability("browserName", "chrome");
	   cop.setCapability("plotformName", "Windows10");
		
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"), cop);
		
		driver.get("https://www.google.co.in/");
	}
	

}
