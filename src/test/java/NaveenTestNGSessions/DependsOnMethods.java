package NaveenTestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}
	@Test(dependsOnMethods="loginTest",priority=1)
	public void homePageTest() {
		System.out.println("HomePage Test");
	}
	@Test(priority=2)
	public void searchPageTest() {
		System.out.println("SearchPage Test");
	}

}
