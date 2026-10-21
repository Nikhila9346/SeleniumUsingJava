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
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");	
		
		List<WebElement> hrefLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+hrefLinks.size());
		
		int brokenLinks = 0;
		
		for(WebElement link:hrefLinks) {
			String href = link.getAttribute("href");
			
			if(href == "null" || href.isEmpty()) {
				System.out.println("href is not having any link");
				continue;
			}
			
			try {
				URL url = new URL(href); //convert string url to url object
				HttpURLConnection conn = (HttpURLConnection) url.openConnection(); //open the connection to the sever
				conn.connect(); //connect to the server
				
				if(conn.getResponseCode() >= 400) {
					System.out.println("Broken link: "+href);
					brokenLinks++;
				}
				else {
					System.out.println("Not a broken link: "+href);
				}
			}
			catch(Exception e){
			}
			System.out.println("Total no.of broken links: "+brokenLinks);
			
		}
		
		driver.quit();
		
		
		
		
		
		
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		
//		//go to the element and extract the url
//		List<WebElement> links = driver.findElements(By.cssSelector("li[class=\"gf-li\"] a"));
//		//creating an object for SoftAssert
//		SoftAssert a = new SoftAssert();
//		
//		for(WebElement link : links) {
//			String url = link.getAttribute("href");
//			
//			//apply java methods to get the status code
//			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
//			conn.setRequestMethod("HEAD");
//			conn.connect(); //establishes the connection with the server
//			int resCode = conn.getResponseCode();
//			System.out.println(resCode);
//			//assertTrue - if the condition fails the assertion message is displayed
//			a.assertTrue(resCode<=400, link.getText() + "is broken link with status code" + resCode);
//			
//		}
//		
//		//to capture the failures
//		a.assertAll();
//		driver.quit();
//		
	}

}
