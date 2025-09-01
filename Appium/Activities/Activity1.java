package activities;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Activity1 {
AppiumDriver driver;
WebDriverWait wait;

   
//Set up function
/**
 * @throws URISyntaxException 
 * @throws MalformedURLException 
 * 
 */
@BeforeClass
public void setUp() throws MalformedURLException, URISyntaxException {
	
	//Define capabilities
	UiAutomator2Options options=new UiAutomator2Options();
	options.setPlatformName("android");
	options.setAutomationName("UiAutomator2");
	options.setApp("path/to/application.apk");
	options.noReset();
	
	//Set the Appium server URL
	URL serverUrl = new URI("http://localhost:4723").toURL();
	
	//Initialize the driver
	driver = new AndroidDriver(serverUrl,options);
}
//public void IOSSetup() {
//	XCUITestOptions options new XCUITestOptions()

//Test Method
@Test

public void multiplyTest() {
	driver.findElement(AppiumBy.id("digit_5")).click();
	
	driver.findElement(AppiumBy.accessibilityId("multiply")).click();
	
	driver.findElement(AppiumBy.id("digit_6")).click();
	
	driver.findElement(AppiumBy.id("equals")).click();
	String result = driver.findElement(AppiumBy.id("result_final")).getText();
	
	assertEquals(result ,"30");
	
}

@AfterClass
public void tearDown() {
	driver.quit();
}
}
