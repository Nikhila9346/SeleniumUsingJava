package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String username = "nikhilabeereddy@gmail.com";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(username);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		waitTime();
		driver.findElement(By.className("signInBtn")).click();
		
		//Assertions 1
		String expected = "You are successfully logged in.";
		waitTime();
		String actual = driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(actual, expected);
		
		//Assertions 2
		String expected1 = "Hello "+username+",";
		waitTime();
		String actual1 = driver.findElement(By.tagName("h2")).getText();
		Assert.assertEquals(actual1, expected1);
		driver.quit();
	
		//assertFalse, assertTrue in HandlingCheckboxes.java
	}
	
	public static void waitTime() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
