import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test51 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
	driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Login']")).click();
	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("sanketnale2010@gmail.com");
	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Sanket@1998");
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	//driver.close();
	//System.out.println("test is passed");
	
	
	//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("")
	
	}

}
