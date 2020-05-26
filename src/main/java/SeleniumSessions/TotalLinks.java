package SeleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
	List<WebElement> Linkslist=	driver.findElements(By.tagName("a"));
	System.out.println("No of links in this page is: "+ Linkslist.size());
	
	
		for(int i=0;i<Linkslist.size();i++) {
			String text=Linkslist.get(i).getText();
	    if(!text.isEmpty()) {
			System.out.println(i + "-->" + text.trim());
			System.out.println(Linkslist.get(i).getAttribute("href"));
		}
	}

	}
}
