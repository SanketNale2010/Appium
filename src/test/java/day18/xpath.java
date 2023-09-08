package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		String productname = driver.findElement(By.xpath("//a[normalize-space()='MacBook']")).getText();
		
        System.out.println(productname);
	  driver.quit();
	}
}
