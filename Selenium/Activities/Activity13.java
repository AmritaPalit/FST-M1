package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity13 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/tables");
		 List<WebElement> lstrow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr"));
		 System.out.println("No of rows are:" + lstrow.size());
		 List<WebElement> lstcol = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		 System.out.println("No of cols are:" + lstcol.size());
		 List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
	        System.out.println("Third row cell values: ");
	        for(WebElement cell : thirdRow) {
	            System.out.println(cell.getText());
	            
	            WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]"));
	            System.out.println("Second row, second cell value: " + cellValue.getText());

	            driver.quit();
	        }

	}

}
