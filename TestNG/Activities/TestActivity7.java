package activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        // Initialize driver
        driver = new FirefoxDriver();
        // Initialize wait
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Open the page
        driver.get("https://training-support.net/webelements/login-form");
    }

    
    @Test(priority = 1)
    public void pageTitleTest() {
    	assertEquals(driver.getTitle(), "Selenium: Login Form");
    
    }
    
    
    
    @DataProvider(name="InvalidCred")
    public static Object[][] creds() {
        return new Object[][] { 
            { "admin1", "WrongPassword" },
            { "wrongAdmin", "Password" },
            {"abcd","defg"}
        };
    }

    @Test(priority = 2, dataProvider = "InvalidCred")
    public void invalidLoginTest(String username, String password) {
        // Find the input fields and the login button
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Submit']"));

        // Clear the input fields
        usernameField.clear();
        passwordField.clear();
        // Enter the credentials
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        //Click Log in
        loginButton.click();

        // Assert login message
        String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subheading"))).getText();
        Assert.assertEquals(message, "Invalid credentials");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
