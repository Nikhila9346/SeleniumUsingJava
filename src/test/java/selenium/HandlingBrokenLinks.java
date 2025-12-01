package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

//broken url - the url pages which gives error page

public class HandlingBrokenLinks {
	public static void main(String args[]) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//go to the element and extract the url
		List<WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
		//creating an object for SoftAssert
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			
			//apply java methods to get the status code
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect(); //establishes the connection with the server
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			//assertTrue - if the condition fails the assertion message is displayed
			a.assertTrue(resCode<=400, link.getText() + "is broken link with status code" + resCode);
			
		}
		
		//to capture the failures
		a.assertAll();
		driver.quit();
		
	}

}
