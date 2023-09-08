import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class test4 
{
public static void main(String[] args)
{
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    int size = driver.findElements(By.tagName("iframe")).size();
	    
	    System.out.println(size);

	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println(total);
	    driver.switchTo().defaultContent();
	    }
	  }
}