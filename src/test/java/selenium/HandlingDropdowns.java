package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HandlingDropdowns {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Handling Static Dropdowns - options in dropdown are fixed
		
		//Handling currency dropdown
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(currency);
		dropdown.selectByIndex(3);
		waitTime();
		dropdown.selectByValue("AED");
		dropdown.selectByVisibleText("INR");
		
		System.out.print(dropdown.getFirstSelectedOption().getText());
		
		//Handling passengers dropdown
		WebElement passengers = driver.findElement(By.className("paxinfo"));
		passengers.click();
		
		waitTime();
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		
		String expected = "5 Adult";
		String actual = passengers.getText();
		Assert.assertEquals(actual, expected);
		
		//Handling Dynamic Dropdowns - these dropdowns are loaded based on the user actions
		
		//from and to dropdown
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value=\"AIP\"]")).click();
		waitTime();
		//using indexing
//		driver.findElement(By.xpath("(//a[@value=\"BHO\"])[2]")).click();
		//without using indexing
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"BHO\"]")).click();
		
		driver.quit();
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
