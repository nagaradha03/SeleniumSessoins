package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> imagesLinks=driver.findElements(By.tagName("img"));
		System.out.println("Number of images present in this page is:"+ imagesLinks.size());
		
		
	for(int i=0;i<imagesLinks.size();i++) {
		System.out.println(i + "-->" +imagesLinks.get(i).getAttribute("src"));
		}
	driver.close();
}
}