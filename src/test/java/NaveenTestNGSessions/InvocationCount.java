package NaveenTestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	public void googleTest(){
		System.out.println("google test");
	}

}
