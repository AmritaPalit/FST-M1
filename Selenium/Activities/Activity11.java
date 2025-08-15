package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/dynamic-controls");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 String title= driver.getTitle();
		 WebElement toggle= driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
		 toggle.click();
		 WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkbox']"));
		 wait.until(ExpectedConditions.invisibilityOf(checkbox));
		 toggle.click();
		 wait.until(ExpectedConditions.visibilityOf(checkbox));
		 checkbox.click();
		 
		 driver.quit();
				 
				
	}

}
