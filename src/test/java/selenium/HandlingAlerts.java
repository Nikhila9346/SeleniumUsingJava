package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {

		/*
		 * 1. Information Alerts 2. Confirmation Alerts 3. prompt.
		 */

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys("Nikhila");

		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();
	}

}