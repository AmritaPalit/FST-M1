package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity2 {
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
	        
	        String Actual = driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']")).getText();
	        
	        Assert.assertEquals(" Learn from Industry Experts ", Actual);
	    }

	    @AfterTest
	    public void afterMethod() {
	        // Close the browser
	        driver.close();
	    }
	}