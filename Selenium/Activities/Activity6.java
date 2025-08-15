package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/dynamic-controls");
		 String Pagetitle =driver.getTitle();
System.out.println(Pagetitle);

Boolean checkboxenabled= driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
if (checkboxenabled == true)
	System.out.println("Checkbox is selected");
else 
	System.out.println("Checkbox is not selected");

driver.findElement(By.xpath("//input[@id='checkbox']")).click();
Thread.sleep(5000);
Boolean checkboxenabled2= driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected();
if (checkboxenabled2 == true)
	System.out.println("Checkbox is selected");
	else 
		System.out.println("Checkbox is not selected");

driver.quit();
	}
}
