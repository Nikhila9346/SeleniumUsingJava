package selenium;
import java.time.Duration;
import java.util.concurrent.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
	
	static String infoMsg;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("nikhilabeereddy@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("n@987N");
		driver.findElement(By.className("signInBtn")).click();
		
		//implicit wait - waits for a specified time before throwing a NoSuchElementException
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String errorMsg = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errorMsg);
		
		//Forgot Password
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nikhila");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("nrir@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("998765678");
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		infoMsg = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		System.out.println(infoMsg);
		
		System.out.print(getPassword());
		
		//Login Again
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		
	}
	
	public static String getPassword() {
		String[] password = infoMsg.split("'");
		return password[1].split("'")[0];
	}
	
	public static void waitTime() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
