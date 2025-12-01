package selenium;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSLCerts {

	public static void main(String[] args) {
		
		//setting the browser behavior before invoking it
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		//To block the pop-ups
		options.setExperimentalOption("ExcludeSwitches", 
									Arrays.asList("disable-popup-blocking"));
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		//pass 'options' as an argument to ChromeDriver class
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//Deleting cookies
		driver.manage().deleteAllCookies();
		//Deleting specific cookie
		driver.manage().deleteCookieNamed("sessionKey");
		
		driver.get("https://expired.badssl.com/");
		System.out.print(driver.getTitle());
		
		driver.quit();
	}

}
