package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToSpecificElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		ElementUtil el=new ElementUtil(driver);
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(4000);
		By element=By.className("menulink");
//		WebElement element=driver.findElement(By.className("menulink"));
//		Actions action=new Actions(driver);
//		action.moveToElement(element).build().perform();
		el.doMoveToSpecificElement(element);
		Thread.sleep(5000);
		driver.findElement(By.linkText("COURSES")).click();

	}

}
