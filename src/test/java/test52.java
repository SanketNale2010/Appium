import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test52 {
	@Test
	public void Register() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Akash");//first name
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("nale");//last name
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("akashnakshine210@gmail.com");//email ID
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("akash1234");//passward
		//Thread.sleep(5000);
		 WebElement privacyPolicy = driver.findElement(By.xpath("//input[@name='agree']"));//privacy Policy
		
		
		
//		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(privacyPolicy)); 
//		privacyPolicy.click();	
			 JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",privacyPolicy);	
		//Thread.sleep(5000);
	 WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Continue']"));//continue button
		//btn.click();
		js.executeScript("arguments[0].click();",btn);
	}

}
