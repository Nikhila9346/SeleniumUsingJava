package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCheckboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println("Handling checkboxes");
		
		//HandlingCheckboxes
		WebElement friendsAndFamily = driver.findElement(By.cssSelector("input[name*='friendsandfamily']"));
		Assert.assertFalse(friendsAndFamily.isSelected());
		friendsAndFamily.click();
		Assert.assertTrue(friendsAndFamily.isSelected());
		
		//count the total no.of checkboxes
		System.out.println(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size());
		
		driver.quit();
		
	}

}
