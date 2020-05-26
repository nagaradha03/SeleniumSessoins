package NaveenTestNGSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

   

public class TestNgSelemium {
	 WebDriver driver;
	@BeforeTest
	 public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");
		
	}
	@Test
	public void verifyLoginPageTitleTest() {
		String title=driver.getTitle();
		System.out.println("Title of the page is:"+title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	@Test
	public void verifySignUpLinkTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Sign up")).isDisplayed());
	}
	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		driver.findElement(By.id("loginBtn")).click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
