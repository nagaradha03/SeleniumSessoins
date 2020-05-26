package NaveenTestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest {
	
	
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
	@Parameters({"username","password"})
	@Test
	public void loginTest(String un,String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.id("loginBtn")).click();
	}

}
