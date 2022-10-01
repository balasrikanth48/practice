package selenium_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args)

	{

		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		
		WebElement root = driver.findElement(By.className("main-content"));
		System.out.println(root.toString());
		WebElement Shadowdom1=getShadowdom(root, driver);
		System.out.println(Shadowdom1);
		WebElement dxipnut=	Shadowdom1.findElement(By.tagName("section"));
		WebElement shadowdom2=getShadowdom(dxipnut, driver);
		WebElement text=shadowdom2.findElement(By.cssSelector("dw-de-signup-form"));
		text.sendKeys("Srikanth");

	}

	public static WebElement getShadowdom(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement shadow = (WebElement) js.executeScript("return arguments[0].shadowRoot",element);
		System.out.println("element form general methode::"+shadow);
		return shadow;
	}
}
