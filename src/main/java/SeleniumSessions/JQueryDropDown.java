package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(4000);
		driver.findElement(By.id("justAnInputBox")).click();
		//single value selection-----
		//selectChoiceValues(driver,"choice 5");
		
		//Multiple value selection----
	   selectChoiceValues(driver,"choice 5","choice 6","choice 6 1","choice 3");
		
		//Select all the values----
		//selectChoiceValues(driver,"ALL");
		
		
	}
	public static void selectChoiceValues(WebDriver driver,String... value) {
		
       List<WebElement> choicelist= driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
       if(value[0].equalsIgnoreCase("All")){
    	   try {
    	   for(int k=0;k<choicelist.size();k++) {
    		   choicelist.get(k).click();
    	   }}
    	   catch(Exception e) {
    	   
    	   }
    	   
       }
       else
       {
		for(int i=0;i<choicelist.size();i++) 
		{
			String text=choicelist.get(i).getText();
			System.out.println(text);
			
			for(int k=0;k<value.length;k++){
			    if(text.equals(value[k])) {
				   choicelist.get(i).click();
				   break;
			   }
			
			
		}
		}			
		
		//driver.close();
		
		
       }	
       
		
	}

}
