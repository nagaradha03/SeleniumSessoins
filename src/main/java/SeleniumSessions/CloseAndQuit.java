package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		System.out.println("Page title is:"+ title);
		//driver.quit();
		driver.close();
		System.out.println(driver.getTitle());
}
}