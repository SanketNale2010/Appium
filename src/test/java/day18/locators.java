package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links="+ links.size());
		
		driver.quit();
		
	}

}
