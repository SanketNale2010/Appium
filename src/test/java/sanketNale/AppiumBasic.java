package sanketNale;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasic extends BaseTest{

	
	@Test
	public void wifiSettingNames() throws MalformedURLException {
		
		//code to start server
		//Appium code--> Appium server --> mobile
		
			driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		
		
		
		//service.stop();
	}
}
