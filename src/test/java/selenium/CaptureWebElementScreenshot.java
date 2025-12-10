package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureWebElementScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement name = driver.findElement(By.cssSelector("[name=\"name\"]"));
		name.sendKeys("NIkhila Reddy");
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("name.png"));
		
		driver.quit();

	}

}
