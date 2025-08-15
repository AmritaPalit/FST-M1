package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 driver.get("https://training-support.net/webelements/dynamic-controls");
			 String Pagetitle =driver.getTitle();
			 WebElement checkbox= driver.findElement(By.xpath("//input[@id='checkbox']"));
			 Boolean checkboxdisplayed= driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed();
				if (checkboxdisplayed == true)
					System.out.println("text box is displayed");
				else 
					System.out.println("text box is not displayed");

				driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
				wait.until(ExpectedConditions.invisibilityOf(checkbox));
				Boolean checkboxenabled2= driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed();
				if (checkboxenabled2 == true)
					System.out.println("text box is enabled");
					else 
						System.out.println("text box is not displayed");
				
				driver.quit();
	}

}
