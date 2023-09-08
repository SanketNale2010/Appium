package commandsWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalCommand {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://demo.nopcommerce.com/register");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}
