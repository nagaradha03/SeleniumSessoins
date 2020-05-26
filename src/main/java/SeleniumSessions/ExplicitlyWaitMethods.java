package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By username = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		ElementUtil el=new ElementUtil(driver);
		String text= el.waitForTitleToBePresent("Login",15);
		System.out.println("the title is:"+text);
		if(el.waitForUrl("login",15))
			{
			System.out.println("login is persent in url");
			}
		el.waitForElementPresent(username,15).sendKeys("Radha@gmail.com");
		el.DoSendKeys(password,"radha123");
		el.waitForElementToBeClickable(loginButton,15).click();
	}
}