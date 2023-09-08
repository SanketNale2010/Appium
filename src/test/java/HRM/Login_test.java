package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_test {

	
	@Test
	public void name() throws InterruptedException {
		
	
		
		
		WebDriver driver=new ChromeDriver();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		String act_title = driver.getTitle();
		 String exp_title = "OrangeHRM";
		 
		 if (act_title.equals(exp_title)) {
			 System.out.println("Test Case is passed");
			
		}
		 else {
			System.out.println("Test case Is Failed");
		}
		 
		 driver.quit();
//		driver.get("https://demo.opencart.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
//		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("sanketnale2010@gmail.com");
//		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Sanket@1998");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	
	
}
