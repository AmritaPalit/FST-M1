package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestActivity3 {
	    WebDriver driver;

	    @BeforeTest
	    public void beforeMethod() {
	        // Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();

	        // Open the browser
	        driver.get("https://training-support.net/webelements/login-form/");
}
	    @Test
	    public void testCase3() {
	        WebElement Username = driver.findElement(By.id("username"));
	        Username.sendKeys("admin");
	        WebElement Password = driver.findElement(By.id("password"));
	        Password.sendKeys("password");
	        WebElement Login = driver.findElement(By.xpath("//button[text()='Submit']"));
	        Login.click();
	        String Actual = driver.findElement(By.cssSelector("h2.text-center")).getText();
	        
	        Assert.assertEquals("Welcome Back, Admin!", Actual);
	    }

	    @AfterTest
	    public void afterMethod() {
	        // Close the browser
	        driver.close();
	    }
	}