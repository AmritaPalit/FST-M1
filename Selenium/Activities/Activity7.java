package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			WebDriver driver=new FirefoxDriver();
			 driver.get("https://training-support.net/webelements/dynamic-controls");
			 String Pagetitle =driver.getTitle();
	System.out.println(Pagetitle);

	Boolean checkboxenabled= driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled();
	if (checkboxenabled == true)
		System.out.println("text box is enabled");
	else 
		System.out.println("text box is not enabled");

	driver.findElement(By.xpath("//button[(@id='textInputButton')]")).click();
	Thread.sleep(5000);
	Boolean checkboxenabled2= driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled();
	if (checkboxenabled2 == true)
		System.out.println("text box is enabled");
		else 
			System.out.println("text box is not enabled");

	driver.quit();
		}
	

	

}
