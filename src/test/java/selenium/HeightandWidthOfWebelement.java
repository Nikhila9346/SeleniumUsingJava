package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightandWidthOfWebelement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//to get height and width of the webpage
		WebElement name = driver.findElement(By.cssSelector("[name=\"name\"]"));
		int height = name.getRect().getDimension().getHeight();
		int width = name.getRect().getDimension().getWidth();
		
		System.out.print(height + " " + width);

		driver.quit();
	}

}
