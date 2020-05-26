package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
//		WebElement RightClick=driver.findElement(By.cssSelector("span.context-menu-one"));
//		Actions action=new Actions(driver);
//		action.contextClick(RightClick).build().perform();
//		List<WebElement> RightOptions=driver.findElements(By.xpath("//li[contains(@class,'context-menu-icon')]/span"));
//		System.out.println(RightOptions.size());
//		for(int i=0;i<RightOptions.size();i++) {
//			String text=RightOptions.get(i).getText();
//			System.out.println(text);
//			
//			if(text.equals("Delete")) {
//				RightOptions.get(i).click();
//				break;
//			}
//			
//		}
		ElementUtil el=new ElementUtil(driver);
		By RightClick=By.cssSelector("span.context-menu-one");
		el.doContext(RightClick);
		By Options=By.xpath("//li[contains(@class,'context-menu-icon')]/span");
		el.doRightClick(Options, "Copy");
		

	}

}
