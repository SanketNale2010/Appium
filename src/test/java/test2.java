import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		
		driver.navigate().refresh();
		ele.click();

	}

}
