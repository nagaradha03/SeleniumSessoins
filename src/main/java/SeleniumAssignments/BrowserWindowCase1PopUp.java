package SeleniumAssignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowCase1PopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Thread.sleep(5000);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String ParentId=it.next();
		System.out.println("parent window id is:"+ ParentId);
		String ChildId1=it.next();
		System.out.println("child1 window id is:"+ChildId1);
		String ChildId2=it.next();
		System.out.println("Child2 window id is "+ChildId2);
		driver.switchTo().window(ChildId1);
		System.out.println("Child1 window title is :"+ driver.getTitle());
		driver.close();
		driver.switchTo().window(ChildId2);
		System.out.println("Child2 window title is :"+driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(ParentId);
		System.out.println("Parent window title is: "+driver.getTitle());
	//	driver.close();
		
		

	}

}
