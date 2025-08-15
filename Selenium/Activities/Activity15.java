package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity15 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/dynamic-attributes");
		WebElement Fullname=driver.findElement(By.xpath("//input[@placeholder='Full name']"));
		Fullname.sendKeys("Amrita");
		WebElement Emailadd=driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		Emailadd.sendKeys("abc.def@gmail.com");
	     WebElement eventDate = driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]"));
		eventDate.sendKeys("2025-06-26");
		WebElement addcomm=driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]']"));
		addcomm.sendKeys("comment");
		WebElement submit=driver.findElement(By.xpath("//button[text()='Submit']"));
		submit.click();
		WebElement success= driver.findElement(By.xpath("//h3[text()='Your event has been scheduled!']"));
		String s = success.getText();
		System.out.println(s);
		
		driver.quit();
	
	}

}
