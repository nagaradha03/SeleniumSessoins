package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VisibilityOfElementsExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtil el = new ElementUtil(driver);

		driver.get("https://www.freshworks.com/");
		By footerLinksList = By.cssSelector("ul.footer-nav li");
		List<WebElement> footerlist=el.visibilityOfAllWebElements(footerLinksList, 15);
		System.out.println(footerlist.size());
		for(int i=0;i<footerlist.size();i++) {
			System.out.println(footerlist.get(i).getText());
		}

	}

}
