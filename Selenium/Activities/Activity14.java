package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 driver.get("https://training-support.net/webelements/tables");
		 String Pagetitle =driver.getTitle();
		
		List<WebElement> col=driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr"));
		 System.out.println("Number of columns: " + col.size());
		 List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
	        System.out.println("Number of rows: " + rows.size());
	        WebElement wb=driver.findElement(By.xpath("//table[contains(@class, 'table-auto')])/thead/tr[1]/td[5]"));
	        
//	        Click the header of the Price column to sort it in ascending order.
	        driver.findElement(By.xpath("//table[contains(@class, 'table-auto')])/thead/tr/th[3]")).click();
	        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[5]/td[2]"));
	        System.out.println("Book Name after sorting: " + cellValue.getText());
	        driver.quit();
	   //     Find and print the Book Name in the 5th row again
	}
	

}
