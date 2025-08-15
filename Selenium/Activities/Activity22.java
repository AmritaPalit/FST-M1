package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity22 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/popups");
        System.out.println("Page title is: " + driver.getTitle());
       driver.findElement(By.id("launcher")).click();
       WebElement username = driver.findElement(By.id("username"));
       WebElement password = driver.findElement(By.id("password"));
       // Enter the credentials
       username.sendKeys("admin");
       password.sendKeys("password");
       driver.findElement(By.xpath("//button[text()='Submit']")).click();

       String message = driver.findElement(By.cssSelector("h2.text-center")).getText();
       System.out.println("Login message: " + message);
       driver.quit();
	}

}
