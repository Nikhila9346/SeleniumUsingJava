package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class InvokingMultipleWindowsTabs {

	public static void main(String[] args) {
		
		/*
		 * Go to https://rahulshettyacademy.com/angularpractice/
		 * Enter the name field with the first Course name available in https://rahulshettyacademy.com/ 
		 * */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Invoking new TAB
		//driver.switchTo().newWindow(WindowType.TAB); //but control is still on the first tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String courseText = driver.findElement(By.xpath("//h3[@class=\"font-bold text-lg group-hover:text-primary transition-colors leading-tight\"][1]")).getText();
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.cssSelector("[name=\"name\"]")).sendKeys(courseText);
//		driver.quit();
		
	}

}
