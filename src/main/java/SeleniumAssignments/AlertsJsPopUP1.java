package SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsJsPopUP1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		//first alert
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		System.out.println("Alert mesg  is:"+ alert.getText());
		alert.accept();
		//Second alert
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[2]/button")).click();
		Thread.sleep(5000);
		Alert alert1=driver.switchTo().alert();
		System.out.println("Alert mesg is: "+alert1.getText());
		alert1.dismiss();
		//Third alert
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		Thread.sleep(5000);
		Alert alert2=driver.switchTo().alert();
		Thread.sleep(7000);
		System.out.println("Alert mesg is: "+alert2.getText());
		alert2.sendKeys("This is js alert");
		System.out.println("Alert mesg is: "+alert2.getText());
		alert2.accept();
		driver.close();
		

	}

}
