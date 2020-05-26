package NaveenTestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void setUp(String url,String browser) {
		switch (browser) {
		case "chrome":
			//WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			//WebDriverManager.firefoxdriver().setup();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please pass the correct browser name : " + browser);
			break;
		}
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.get(url);
		
		}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}