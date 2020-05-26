package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	WebDriver driver;
	public WebDriver init_Driver(String browserName )
	{
		switch(browserName) {
		case"Chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case"Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case"safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
			break;
		default:
		    System.out.println(browserName  +"not found");
		break;
		}
		return driver;
		
	}
	public void launchUrl(String url)
	{
		driver.get(url);
		
		}
	public void navigateToUrl(String url) {
		driver.navigate().to(url);
		
	}
   public String getBrowserTitle() {
	  return driver.getTitle();
   }
   public void doQuit() {
	   driver.quit();
   }
}
	
