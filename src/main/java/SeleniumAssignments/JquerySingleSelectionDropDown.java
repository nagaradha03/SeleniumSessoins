package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySingleSelectionDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
	    WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(4000);
		driver.findElement(By.id("justAnotherInputBox")).click();
		
		int choice_index = DoSelectSingleValue(driver,"choice 2");
		System.out.println(choice_index);
		List<WebElement> choicelist2=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		boolean b = choicelist2.get(choice_index).isSelected();
		System.out.println(b);
		choicelist2.get(choice_index).click();
		
		
				
        }
	public static int DoSelectSingleValue(WebDriver driver,String value)  {
		List<WebElement> choicelist=driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
		int index = 0;
		for(int i=0;i<choicelist.size();i++) {
			String text=choicelist.get(i).getText();
			System.out.println(text);
			
			if(text.equals(value)) {
				choicelist.get(i).click();
				index = i;
				break;
			}
		
//		for(int j=0;j<choicelist.size();j++) {
//			Boolean b=choicelist.get(j).isSelected();
//		if(b.equals(true)) {
//		System.out.println("__________");
//				choicelist.get(i).click();
//				break;
//			}
	
		
//		}
//	return i;
		}
		return index;
	}

}

