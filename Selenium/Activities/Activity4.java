package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		String ThirdHeader= driver.findElement(By.xpath ("//h3[contains(text(),'#3')]")).getText();
		System.out.println(ThirdHeader);
		String FifthHeader= driver.findElement(By.xpath ("//h5[contains(text(),'#5')]")).getText();
		System.out.println(FifthHeader);
		
		String purpleButtonClass = driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class");
	    System.out.println(purpleButtonClass);
	    String SlateButtonClass = driver.findElement(By.xpath("//button[text()='Slate']")).getText();
	    System.out.println(SlateButtonClass);
	    driver.quit();
	}
}
