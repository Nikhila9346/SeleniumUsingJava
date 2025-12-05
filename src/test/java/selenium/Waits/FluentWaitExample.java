package selenium.Waits;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		//Fluent Wait

		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
							.withTimeout(Duration.ofSeconds(30))       // Max wait time
							.pollingEvery(Duration.ofSeconds(5))       // Polling interval
							.ignoring(NoSuchElementException.class);   // Ignore exceptions

		WebElement element = fluentWait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.cssSelector("div[id='finish']")).isDisplayed()) {
					return driver.findElement(By.cssSelector("div[id='finish']"));
				}
				else
					return null;
			}
		});

		System.out.println(driver.findElement(By.cssSelector("div#finish")).getText());
	}

}
