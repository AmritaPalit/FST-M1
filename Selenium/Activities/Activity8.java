package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/webelements/mouse-events");
		 Actions builder = new Actions(driver);
		 String Pagetitle =driver.getTitle();
		 
		WebElement web1= driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement web2= driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));	
		WebElement web3= driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement web4= driver.findElement(By.xpath("//h1[text()='target']"));
		WebElement web5= driver.findElement(By.xpath("//span[text()='Open']"));
		builder.click(web1).moveToElement(web2).build().perform();
		builder.doubleClick(web3).build().perform();
		builder.click(web5);
		System.out.println("Task is completed");
		
		
	}

}
