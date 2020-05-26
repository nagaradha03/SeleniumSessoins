package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
// launch browser-->enter url-->verify google title-->close driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
