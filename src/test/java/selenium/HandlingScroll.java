package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HandlingScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1. based on pixel value
//		js.executeScript("window.scroll(0, 700)");
//		System.out.println(js.executeScript("return window.pageYOffset"));
		
		//2. scroll till the element is visible
//		WebElement legend = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
//		js.executeScript("arguments[0].scrollIntoView()", legend);
		
		//3. scroll to the end of the page
		js.executeScript("window.scroll(0, document.body.scrollHeight)");
		
		Thread.sleep(10);
		
		//4. scroll to initial position
		js.executeScript("window.scroll(0, -document.body.scrollHeight)");
		
		//component-level scrolling
//		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
//		driver.quit();

	}

}
