package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		String browser="chrome";
		WebDriver driver=null;
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browser.equals("safari")){
			driver=new SafariDriver();}
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("Page title is:"+ title);
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.close();
			
			
		}
	}


