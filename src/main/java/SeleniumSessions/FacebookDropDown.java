package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//String date="May-7-1983";
		By Day=By.id("day");
		By Month=By.id("month");
		By Year=By.id("year");
		ElementUtil el=new ElementUtil(driver);
		doSelectDropDownValue(driver,Month,"Nov");
		doSelectDropDownValue(driver,Day,"5");
		
		doSelectDropDownValue(driver,Year,"2000");}
		
//		el.doSelectVisibleByText(Month, "Jun");
//		el.doSelectVisibleByText(Day,"3");
//		el.doSelectVisibleByText(Year, "1982");
//		el.doSelectVisibleByText(Month, date.split("-")[0]);
//		el.doSelectVisibleByText(Day,date.split("-")[1]);
//		el.doSelectVisibleByText(Year, date.split("-")[2]);
//		System.out.println("--------------");
		
//		Select selectMonth=new Select(driver.findElement(Month));
//		List<WebElement> MonthList=selectMonth.getOptions();
//		System.out.println(MonthList.size());
//		for(int i=0;i<MonthList.size();i++) {
//			String text=MonthList.get(i).getText();
//			System.out.println(text);
//			if(text.equals("Oct")) {
//				MonthList.get(i).click();
//				break;
//			}
			
		
//		System.out.println("--------------");
//		Select selectDay=new Select(driver.findElement(Day));
//		List<WebElement>DayList=selectDay.getOptions();
//		System.out.println(DayList.size());
//		for(int i=0;i<DayList.size();i++) {
//			String text=DayList.get(i).getText();
//			System.out.println(text);
//			
//		}
//		System.out.println("-----------------");
//		Select selectYear=new Select(driver.findElement(Year));
//		List<WebElement> YearList=selectYear.getOptions();
//		System.out.println(YearList.size());
//		for(int i=0;i<YearList.size();i++) {
//			String text=YearList.get(i).getText();
//			System.out.println(text);
//			
//		}
	//}
//		ArrayList<String> MonthList=doGetDropDownOptions( driver,Month);
//		System.out.println(MonthList.size());
//		System.out.println(MonthList);
//		ArrayList<String> DayList=doGetDropDownOptions( driver,Day);
//		System.out.println(DayList.size());
//		System.out.println(DayList);
//		ArrayList<String> YearList=doGetDropDownOptions( driver,Year);
//		System.out.println(YearList.size());
//		System.out.println(YearList); 
//		System.out.println("Total options in month list box: "+doDropDownOptionsCount(driver,Month));
//		System.out.println("Total options in day list box: "+doDropDownOptionsCount(driver,Day));
//		System.out.println("Total options in year list box: "+doDropDownOptionsCount(driver,Year));
//		
//		
//	}
//	public static int doDropDownOptionsCount(WebDriver driver,By locator) {
//	return doGetDropDownOptions( driver,locator).size();
//	}
//
//		public static ArrayList<String> doGetDropDownOptions(WebDriver driver,By locator) {
//			ArrayList<String> ar=new ArrayList<String>();
//		Select select=new Select(driver.findElement(locator));
//			List<WebElement> OptionsList=select.getOptions();
//			System.out.println(OptionsList.size());
//			
//			for(int i=0;i<OptionsList.size();i++) {
//				String text=OptionsList.get(i).getText();
//				//System.out.println(text);
//				ar.add(text);				
//			
//	      }
//			return ar;
//			
//	}
//		
//	
	
	
	
	
	
    public static void doSelectDropDownValue(WebDriver driver,By locator,String value) {
    	Select select=new Select(driver.findElement(locator));
		List<WebElement> OptionsList=select.getOptions();
		System.out.println(OptionsList.size());
		
		for(int i=0;i<OptionsList.size();i++) {
			String text=OptionsList.get(i).getText();
			//System.out.println(text);
			if(text.equals(value)) {
				OptionsList.get(i).click();
				break;
			}
    	
    }
}
    

}