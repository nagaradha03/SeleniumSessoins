package SeleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kishorelr\\Downloads\\chromedriver_win32(1)\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();
       // driver.get("https://app.hubspot.com/login");
       // Thread.sleep(5000);
      //  id:case:1
//        driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//        driver.findElement(By.id("password")).sendKeys("test@123");
//        driver.findElement(By.id("loginBtn")).click();
      //id case:2
//        WebElement emailid=driver.findElement(By.id("username")); 
//        emailid.sendKeys("test@gmail.com");
//        WebElement password=driver.findElement(By.id("password"));
//        password.sendKeys("test@123");
//        WebElement loginbtn=driver.findElement(By.id("loginBtn"));
//        loginbtn.click();
      //id case:3
        
//        By email=By.id("username");
//        By password=By.id("password");
//        By loginbtn=By.id("loginBtn");
//        WebElement emailid=driver.findElement(email);
//        emailid.sendKeys("test@gmail.com");
//        WebElement password1=driver.findElement(password);
//        password1.sendKeys("test@123");
//        WebElement login=driver.findElement(loginbtn);
//        login.click();
        
        // id case 4:----->1
//        String user="username";
//        String pwd="password";
//        String login="loginBtn";
//        By email=By.id(user);
//        By password=By.id(pwd);
//        By loginbtn=By.id(login);
//      WebElement emailid=driver.findElement(email);
//     emailid.sendKeys("test@gmail.com");
//     WebElement password1=driver.findElement(password);
//      password1.sendKeys("test@123");
//      WebElement login1=driver.findElement(loginbtn);
//     login1.click();
//     
     //Locator name---->2
//     driver.get("http://classic.crmpro.com/");
//     WebElement username=driver.findElement(By.name("username"));
//     username.sendKeys("test@gmail.com");
     
     //Locator classname------>3
   //  driver.get("https://app.hubspot.com/login");
   //   Thread.sleep(5000);
//      WebElement username=driver.findElement(By.className("login-email"));
//   //  form-control private-form__control login-email
//      username.sendKeys("test@gmail");
//     
        
      //Locator Xpath----->4
//      WebElement username=driver.findElement(By.xpath("//*[@id=\'username\']"));
// 
//      username.sendKeys("test@gmail");
      
      //Locator CssPath---->5

//      WebElement username=driver.findElement(By.cssSelector("#username"));
//        username.sendKeys("test@gmail");
      
      
      //Locator linktext---->6
      //  driver.get("http://classic.crmpro.com/");
//      WebElement username=driver.findElement(By.linkText("Selenium Jobs"));
//    username.click();
        
        //Locator partial linktext--->7
        
//     WebElement username=driver.findElement(By.partialLinkText("Selenium "));
//      username.click();
      
      //Locator tagname--->8
      
      driver.get("https://www.freshworks.com/");
      WebElement header=driver.findElement(By.tagName("h1"));
      String s=header.getText();
      System.out.println(s);
      
      
	}

}

