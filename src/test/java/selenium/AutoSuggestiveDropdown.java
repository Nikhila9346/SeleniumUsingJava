package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//AutoSuggestiveDropdown
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		waitTime();
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));
		System.out.print(options);
		
		//traversing the elements
		for(WebElement option:options) {
			if(option.getText().equals("India")) {
				option.click();
				break;
			}
		}
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
