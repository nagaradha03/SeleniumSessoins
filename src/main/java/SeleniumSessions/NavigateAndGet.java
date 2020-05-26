package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.navigate().to("http://www.amazon.com");
		driver.navigate().to("http://www.rediff.com");
		driver.navigate().back();
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
