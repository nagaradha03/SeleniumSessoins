package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMoveElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://book.spicejet.com/");
		Thread.sleep(5000);
		By Login=By.id("Login");
		ElementUtil el=new ElementUtil(driver);
		el.doMoveToSpecificElement(Login);
		By SpiceClub=By.linkText("SpiceClub Members");
		el.doMoveToSpecificElement(SpiceClub);
		driver.findElement(By.linkText("Member Login")).click();

	}

}
