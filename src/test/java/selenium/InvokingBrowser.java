package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class InvokingBrowser {

	public static void main(String[] args) {
		
		// Invoking Chrome Browser
		// WebDriver is a Interface, ChromeDriver is a class which provides the implementation for WebDriver Methods
		//gecko --> Firefox, edge --> MSEdge
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Basic Selenium WebDriver Methods
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Difference between close() and quit()
		//To close the current browser
		driver.close(); 
		//To close all the browsers
		driver.quit();
		
	}

}
