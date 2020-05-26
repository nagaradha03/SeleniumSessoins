package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.init_Driver("Chrome");
		br.launchUrl("https:www.google.com");
     	br.navigateToUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		String title=br.getBrowserTitle();
		System.out.println(title);
		
		By emailid=By.id("username");
		By password=By.id("password");
		By login=By.id("loginBtn");
		//By header=By.cssSelector("h1.private-page__title");
		ElementUtil el=new ElementUtil(driver);
		el.DoSendKeys(emailid,"naveenanimation30@gmail.com" );
		el.DoSendKeys(password, "Test@1234 ");
		if(el.doIsDisplayed(login)) {
			el.doClick(login);
		}
		
		Thread.sleep(5000);
		//String headertext=el.doGetText(header);
		//System.out.println("home page header is:"+headertext);
		
		
		br.doQuit();
	}

}
