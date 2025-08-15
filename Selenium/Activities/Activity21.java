package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity21 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/tabs");
        System.out.println("Page title is: " + driver.getTitle());
driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
}
driver.findElement(By.xpath("//button[text()='Open Another One']")).click();
for (String handle : driver.getWindowHandles()) {
    driver.switchTo().window(handle);
    
    
	}
driver.quit();
}}
