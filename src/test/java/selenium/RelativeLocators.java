package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Relative Locators - above(), below(), toLeftOf(), toRightOf()
		
		//above() example
		WebElement name = driver.findElement(By.cssSelector("[name=\"name\"]"));
		
		String tagName = driver.findElement(RelativeLocator.with(By.tagName("label")).above(name)).getText();
		System.out.println(tagName);
		
		//below() example
		WebElement dob = driver.findElement(By.cssSelector("[name=\"bday\"]"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(dob)).click();
		
		
	}

}
