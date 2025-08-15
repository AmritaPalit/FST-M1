package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/drag-drop");
		 String title= driver.getTitle();
		 System.out.println("Title is "+ title);
		 Actions builder = new Actions(driver);
WebElement ball = driver.findElement(By.xpath("//img[@id='ball']"));
WebElement dropzone1 = driver.findElement(By.xpath("//div[@id='dropzone1']"));
WebElement dropzone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
builder.clickAndHold(ball).release(dropzone1).build().perform();
WebElement dropped = driver.findElement(By.xpath("//span[@class='dropzone-text svelte-lit24y']"));
String drp= dropped.getText();
if(drp.equals("Dropped"))
	System.out.println("Ball is dropped");

builder.clickAndHold(ball).release(dropzone2).build().perform();
WebElement dropped2 = driver.findElement(By.xpath("//span[@class='dropzone-text svelte-lit24y']"));
String drp2= dropped2.getText();
if(drp2.equals("Dropped"))
	System.out.println("Ball is dropped");
driver.quit();
	}

}
