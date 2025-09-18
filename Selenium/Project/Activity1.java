package project;
    

   
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	import static org.testng.Assert.assertEquals;


	public class Activity1 {
		    WebDriver driver;

@BeforeClass
		    public void beforeMethod() {
		        // Create a new instance of the Firefox driver
		        driver = new FirefoxDriver();

		        // Open the browser
		        driver.get("https://alchemy.hguy.co/lms/");
	}
		    @Test
		    public void testcase1() {
		        
		        String title= driver.getTitle();
				 System.out.println("Title is "+ title);
		      
		        Assert.assertEquals("Alchemy LMS – An LMS Application", title);
		    }

		    @AfterClass
		    public void afterMethod() {
		        // Close the browser
		        driver.close();
		    }
	}