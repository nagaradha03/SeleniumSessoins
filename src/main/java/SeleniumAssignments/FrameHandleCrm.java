package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import SeleniumSessions.BrowserUtil;
import SeleniumSessions.ElementUtil;
public class FrameHandleCrm {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://classic.crmpro.com/");
//		driver.findElement(By.name("username")).sendKeys("UserName");
//		driver.findElement(By.name("password")).sendKeys("Test@12345");
//		driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input")).click();
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.init_Driver("Chrome");
		br.launchUrl("https://classic.crmpro.com/");
		By UserName=By.name("username");
		By PassWord=By.name("password");
		By Tag=By.tagName("a");
		By LogIn=By.xpath("/html/body/div[2]/div/div[3]/form/div/div/input");
		ElementUtil el=new ElementUtil(driver);
		el.DoSendKeys(UserName,"batchautomation");
		el.DoSendKeys(PassWord, "Test@12345");
		el.doClick(LogIn);
		int framecount=driver.findElements(By.tagName("frame")).size();
        System.out.println("No of frames: "+ framecount);
		driver.switchTo().frame("mainpanel");
		el.doClick(Tag);
		driver.switchTo().defaultContent();
		
		br.doQuit();
		
		
		
		
	}

}
