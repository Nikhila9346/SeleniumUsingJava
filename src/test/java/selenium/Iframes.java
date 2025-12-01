package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		//switch to Iframe
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));
		WebElement target = driver.findElement(By.cssSelector("div[id=\"droppable\"]"));

		//drag and drop the frame
		Actions a = new Actions(driver);
//		a.dragAndDrop(source, target).build().perform();
//		a.clickAndHold(source).pause(Duration.ofSeconds(1)).moveToElement(target).release().perform();
		

		a.clickAndHold(source)
		 .moveByOffset(150, 2)
		 .release()
		 .perform();
		
		driver.switchTo().defaultContent();

		driver.quit();
		
	}

}
