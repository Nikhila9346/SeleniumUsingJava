package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//download external commons.io jar
import org.apache.commons.io.FileUtils;

public class TakingScreenshots {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		//change the behavior of the driver to take screenshot
		//driver object should be converted into TakesScreenshot object
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\NBEEREDD\\eclipse-workspace\\automation-practice\\screenshots\\ss1.png"));
		driver.quit();
		
	}

}
