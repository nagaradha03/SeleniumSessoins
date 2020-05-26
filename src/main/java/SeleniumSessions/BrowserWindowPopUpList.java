package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowPopUpList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #1")).click();
		Set<String> handles=driver.getWindowHandles();
		List<String> handlelist=new ArrayList<String>(handles);
		System.out.println("NO of windows are:"+ handlelist.size());
		String ParentId=handlelist.get(0);
		String ChildId=handlelist.get(1);
		System.out.println("Parent id is :"+ParentId);
		System.out.println("Child id is :"+ChildId);
		driver.switchTo().window(ChildId);
		System.out.println("Child window title is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentId);
		System.out.println("Parent window title is:"+driver.getTitle());
		

	}

}
