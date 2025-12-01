package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivities {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//waits till the full page is loaded
		driver.get("https://google.com");
		//performs actions if atleast one element is loaded on that page
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().to("https://hackerrank.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
