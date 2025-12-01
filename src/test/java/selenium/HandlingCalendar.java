package selenium;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingCalendar {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String expected_date = "2025-06-06";
		int date = 6;
		int month = 6;
		int year = 2025;
//		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//a[@value=\"AIP\"]")).click();
//		waitTime();
//		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"BHO\"]")).click();
//		
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
//		waitTime();
//		
//		driver.quit();
		
		//Handling Calendar dynamically
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("button.react-date-picker__calendar-button")).click();
		for(int i=0; i<2; i++) {
			driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		}
		driver.findElement(By.xpath("//button[contains(@class, \"react-calendar__decade-view__years__year\")][text()='2025']")).click();
		waitTime();
		List<WebElement> months = driver.findElements(By.xpath("//button[contains(@class,\"react-calendar__year-view__months__month\")]//abbr"));
		months.get(month-1).click();
		
		
		waitTime();
		driver.findElement(By.xpath("//button[contains(@class,\"react-calendar__month-view__days__day\")]//abbr[text()='"+date+"'][contains(@aria-label, '"+month+"')]")).click();
		String actual_date = driver.findElement(By.xpath("//input[@name='date']")).getAttribute("value");
		Assert.assertEquals(actual_date, expected_date);
		
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
