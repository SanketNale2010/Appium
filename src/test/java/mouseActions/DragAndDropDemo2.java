package mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo2 {

	public static void main(String[] args) {
    
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://bestvpn.org/html5demos/drag/");
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	      Actions act=new Actions(driver);	
	      
	     WebElement src = driver.findElement(By.xpath("//a[@id='one']"));
	     
	     WebElement dest = driver.findElement(By.xpath("//div[@id='bin']"));
	     
	     
	     act.dragAndDrop(src, dest).perform();//drag and drop
   System.out.println("test is passed");
	}

}
