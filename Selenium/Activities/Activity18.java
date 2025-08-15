package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title is: " + driver.getTitle());
       driver.findElement(By.id("simple")).click();
        Alert alr= driver.switchTo().alert();
        
        		driver.switchTo().alert().accept();

	}

}
