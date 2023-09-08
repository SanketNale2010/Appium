package KeyBoardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcutor {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("sanket");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-2']")).sendKeys("nale");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("9822829929");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-4']")).sendKeys("India");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-5']")).sendKeys("Pune");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-6']")).sendKeys("Sanketnale2015@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='RESULT_TextField-3']")).sendKeys("9822829929");
		
		
		
		
	}

}
