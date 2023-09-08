package DatePicker;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Datepicker.html");

//		driver.findElement(By.xpath("//input[@id='datepicker2']")).sendKeys("12/05/2023");

		String year = "2024";
		String month = "June";
		String date = "26";

		driver.findElement(By.cssSelector("#datepicker1")).click();

		// select month and year
		while (true) {
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yer = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (mon.equals(month) && yer.equals(year)) {
				break;

			}

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();//past date
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// future date

		}
		// select the Date
		List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for (WebElement dt : allDate) {
			if (dt.getText().equals(date)) {

				dt.click();
				break;

			}
		}
		
		System.out.println("Date of Birth id Passed");

	}

}
