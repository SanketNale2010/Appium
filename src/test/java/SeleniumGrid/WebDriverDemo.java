package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebDriverDemo {
	
	public static void main(String[] args) throws MalformedURLException {
		
		ChromeOptions chromeoptions=new ChromeOptions();

		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),chromeoptions);
		
		driver.get("http://www.google.com");
		
		 WebElement searchField = driver.findElement(By.name("q"));
		 searchField.click();
		 searchField.sendKeys("pluralsight");
		 searchField.sendKeys(Keys.ENTER);
		 
	}

}
