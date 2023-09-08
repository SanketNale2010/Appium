package AutoSuggestDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test99 {

	
	 public static void main(String[] args) {
		
		 
		 WebDriver driver=new ChromeDriver();
		 
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Diamond");
		 
		 
		 List<WebElement> list = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
		 
		
		 for(int i=0;i<list.size();i++)
			{
				String text=list.get(i).getText();
				
				if(text.equals("Diamond Tennis Bracelet"))
				{
					list.get(i).click();
					break;
					
				}
				
			}
		 driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
	}	
}
