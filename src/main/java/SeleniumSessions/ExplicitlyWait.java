package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		By username = By.id("username");
		By password = By.id("password");
		By loginButton = By.id("loginBtn");
		
//		WebDriverWait wait=new WebDriverWait(driver,15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
//		driver.findElement(By.id("username")).sendKeys("Radha");
//		driver.findElement(By.id("password")).sendKeys("Radha1");
//		wait=new WebDriverWait(driver,15);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
//		driver.findElement(By.id("loginBtn")).click();
//		
		waitForElementPresent(driver,15,username).sendKeys("Radha@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Radha1");
		waitForElementPresent(driver,15,loginButton).click();
		
		

	}
	public static WebElement waitForElementPresent(WebDriver driver, int timeout, By locator){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
		
	}
	

}
