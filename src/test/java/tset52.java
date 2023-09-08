

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tset52 {

	@Test
	public void DemoECpmmarce() {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click(); //radio button
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("akash");//first name
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("nakshine");//last name
		WebElement drpdwn1 = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));//SELECT DAY
		Select day=new Select(drpdwn1);
		day.selectByVisibleText("26");
		
		WebElement drpdwn2 = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));//SELECT month
		Select month=new Select(drpdwn2);
		month.selectByVisibleText("June");
		
		WebElement drpdwn3 = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));//SELECT DAY
		Select year=new Select(drpdwn3);
		year.selectByVisibleText("1998");
		
		
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sanketnale2015@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("ola");//company textfield
		
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Sanket@1998");//passward
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Sanket@1998");//confirm passward
		
		
		driver.findElement(By.xpath("//button[@id='register-button']")).click();//register button
		
	}
}
