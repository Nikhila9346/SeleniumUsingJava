package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement checkIn = driver.findElement(By.cssSelector("a[class='spiceFare']"));
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Type to Select']"));
		
		//hover on check-in
		Actions action = new Actions(driver);
		action.moveToElement(checkIn).build().perform();
		
		//Type "India" in search box in UPPERCASE and select the text
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("India").doubleClick().perform();
	}

}
