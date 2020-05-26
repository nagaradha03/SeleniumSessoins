package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br= new BrowserUtil();
		WebDriver driver=br.init_Driver("Chrome");
		br.launchUrl("http://the-internet.herokuapp.com/dropdown");
		
		ElementUtil el=new ElementUtil(driver);
		By dropdown=By.id("dropdown");
		el.doSelectVisibleByText(dropdown, "Option 2");
		Thread.sleep(5000);
		br.doQuit();

	}

}
