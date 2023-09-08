package commandsWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*get(url)
 getTitle()
 getCurrentURL()
 getPageSource
 getWindowHandle()
 getWindowHandles()
 */

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		System.out.println("title of the page:" + driver.getTitle());
		System.out.println("Current URL:" + driver.getCurrentUrl());
//
//		System.out.println("Page Source..........");
//		System.out.println(driver.getPageSource());
        Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	
		Set<String> windoeids = driver.getWindowHandles();
		
		for(String winid:windoeids ) {
			System.out.println(winid);
		}
		driver.quit();
	}

}
