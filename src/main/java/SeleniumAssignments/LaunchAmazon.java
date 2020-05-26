package SeleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String title=driver.getTitle();
        System.out.println("Title of the page is :"+title);
        
        if(title.contains("Electronics")) {
        	System.out.println("correct title");
        }
        else {
        	System.out.println("Incorrect title");
        }
        if(title.contains("Apparel")) {
        	System.out.println("correct title");
        }
        else {
        	System.out.println("Incorrect title");
        }
        if(title.contains("Books")) {
        	System.out.println("correct title");
        }
        else {
        	System.out.println("Incorrect title");
        }
        
        String url=driver.getCurrentUrl();
        System.out.println("The current url of the page is:"+ url);
        
        if(url.contains("amazon")) {
        	System.out.println("Correct url");
        }
        else
        {
        	System.out.println("Incorrect url");
        	}
        
        driver.close();
	}

}
