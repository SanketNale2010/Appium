import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/");
	    driver.manage().window().maximize();
	    
	    
	    driver.findElement(By.xpath("//a[@class='ud-btn ud-btn-medium ud-btn-secondary ud-heading-sm']")).click();
	    //driver.findElement(By.xpath(""))
	
	}

}
