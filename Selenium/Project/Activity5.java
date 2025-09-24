
package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity5 {
	    WebDriver driver;

	    @BeforeTest
	    public void beforeMethod() {
	        // Create a new instance of the Firefox driver
	        driver = new FirefoxDriver();

	        // Open the browser
	        driver.get("https://alchemy.hguy.co/lms");
}
	    @Test
	    public void testCase3() {
	    	
	    	driver.findElement(By.xpath("//a[text()='My Account']")).click();
	    	
	    	String Actual = driver.findElement(By.xpath("//h1[text()='My Account']")).getText();
	    
	        
	        Assert.assertEquals("My Account", Actual);
	    }

	    @AfterTest
	    public void afterMethod() {
	        // Close the browser
	        driver.close();
	    }
	}