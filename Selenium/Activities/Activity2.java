package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/login-form");
		// TODO Auto-generated method stub
//Find username field and enter admin
		driver.findElement(By.id("username")).sendKeys("admin");
//Find the password field using any locator and enter "password" into it.
		driver.findElement(By.id("password")).sendKeys("password");
		
//Find the "Log in" button using any locator and click it.
		driver.findElement(By.cssSelector("button.svelte-1pdjkmx")).click();
//Close the browser.
		driver.quit();
		
	}

}
