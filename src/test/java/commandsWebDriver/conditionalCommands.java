package commandsWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalCommands {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
//		logo status
//		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		System.out.println("display status of logo:"+logo.isDisplayed());
//		
//		boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
//		System.out.println("display statis of logo:"+status);
//		
		
//		WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
//		System.out.println("display status:"+searchbox.isDisplayed());
//		System.out.println("enabled Status:"+searchbox.isEnabled());
		
		//isSelected()
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection....");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		
		 
		driver.quit();
	}

}
