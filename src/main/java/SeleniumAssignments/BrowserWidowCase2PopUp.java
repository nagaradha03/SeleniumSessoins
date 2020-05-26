package SeleniumAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWidowCase2PopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Thread.sleep(5000);
		Set<String> handle1=driver.getWindowHandles();
		Iterator<String> it=handle1.iterator();
		String ParentId=it.next();
		System.out.println("Parent id :"+ParentId);
		String Child1=it.next();
		System.out.println("Child1 id:" +Child1);
		driver.switchTo().window(Child1);
		System.out.println("Child1 window title is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentId);
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Thread.sleep(5000);
		Set<String> handle2=driver.getWindowHandles();
		Iterator<String> it2=handle2.iterator();
		String ParentId1=it2.next();
		System.out.println("Parent id :"+ParentId1);
		String Child2=it2.next();
		System.out.println("Child2 id:" +Child2);
		driver.switchTo().window(Child2);
		System.out.println("Child2 window title is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentId);
		//driver.quit();
		
	}

}
