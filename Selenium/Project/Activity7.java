
package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activity7{
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
	    	
	    	driver.findElement(By.xpath("//a[text()='All Courses']")).click();
	    	
	        List<WebElement> courses = driver.findElements(By.xpath("//div[@class='ld-course-list-items row']/div"));

	        // Print the number of courses found
	        System.out.println("Number of courses available: " + courses.size());
	    }
	    @AfterTest
	    public void afterMethod() {
	        // Close the browser
	        driver.close();
	    }
}
	    	
	    	
	    	