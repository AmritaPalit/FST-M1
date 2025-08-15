package activities;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();

	        // Open the page
	        driver.get("https://training-support.net/webelements/selects");
	        
	        System.out.println("Page title is: " + driver.getTitle());
	        WebElement dropdown=driver.findElement(By.cssSelector("select.h-80"));
	        Select sel=new Select(dropdown);
	       // List <WebElement> options = sel.getOptions();
	        sel.selectByVisibleText("HTML");
	        for(int i=3;i<=5; i++)
	        {
	        sel.selectByIndex(i);}
	       
	        sel.selectByValue("nodejs");
	        sel.deselectByIndex(5);
	        driver.quit();
	        
	        
	        
	}

}
