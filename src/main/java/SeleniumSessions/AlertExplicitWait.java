package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertExplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtil el = new ElementUtil(driver);
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		By clickForJsAlert=By.xpath("//button[text()='Click for JS Alert']");
		
		//el.waitForElementToBeClickable(clickForJsAlert, 10).click();
		el.clickWhenReady(clickForJsAlert, 10);
		Alert alert=el.waitForAlertToBePresent(10);
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		

	}

}
