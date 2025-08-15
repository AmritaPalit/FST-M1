package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/alerts");
        System.out.println("Page title is: " + driver.getTitle());
       driver.findElement(By.id("prompt")).click();
        Alert alr= driver.switchTo().alert();
        String alertText = alr.getText();
        System.out.println("Text in alert: " + alertText);
        alr.sendKeys("Awesome");        
        		driver.switchTo().alert().accept();
driver.quit();
	}

}
