package NaveenTestNGSessions;

import org.testng.annotations.Test;

public class ExceptedExceptionconcept {
	
	
	@Test(expectedExceptions=Exception.class)
	public void divTest() {
		
		int i=8/0;
		
	}

}
