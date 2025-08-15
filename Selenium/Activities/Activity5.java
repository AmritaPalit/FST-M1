package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/dynamic-controls");
		 String Pagetitle =driver.getTitle();
System.out.println(Pagetitle);

Boolean checkboxdisplayed= driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed();
if (checkboxdisplayed == true)
	System.out.println("Checkbox is displayed");
driver.findElement(By.xpath("//button[(text()='Toggle Checkbox')]")).click();
Thread.sleep(5000);
Boolean checkboxdisplayed2= driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed();
if (checkboxdisplayed2 == true)
	System.out.println("Checkbox is displayed");
	else 
		System.out.println("Checkbox is not displayed");

driver.quit();
	}

}
