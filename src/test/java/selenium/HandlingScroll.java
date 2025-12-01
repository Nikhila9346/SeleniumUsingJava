package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//window-level scrolling
		js.executeScript("window.scroll(0, 700)");
		//component-level scrolling
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		//sum
		int sum = 0;
		List<WebElement> amount = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		String[] totalExpected = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":");
		int total = Integer.parseInt(totalExpected[1].trim());
		
		
		for(int i=0; i<amount.size(); i++) {
			sum += Integer.parseInt(amount.get(i).getText());
		}
		System.out.print(sum);
		Assert.assertEquals(sum, total);
		
		driver.quit();

	}

}
