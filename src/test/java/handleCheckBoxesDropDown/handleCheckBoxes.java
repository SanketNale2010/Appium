package handleCheckBoxesDropDown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleCheckBoxes {
	
	

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
//		String s="https://itera-qa.azurewebsites.net/home/automation";
//		driver.get(s);
		
		 
		
		driver.navigate().to("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input'  and @type='checkbox' ]"));
	     System.out.println("total number of checkboxes;"+checkboxes.size());
	     
	     
	     //selelct all checkboxes
//	     for (int i = 0; i <checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//		}
	     
	     //select last two checkboxes
//	     for (int i = 5; i < checkboxes.size(); i++) {
//			checkboxes.get(i).click();
//		}
	     
	     //select first two checkboxes
	     for (int i = 0; i < 2; i++) {
			checkboxes.get(i).click();
		}
	     
	     

	     
	     //driver.close();
	
	}

}
