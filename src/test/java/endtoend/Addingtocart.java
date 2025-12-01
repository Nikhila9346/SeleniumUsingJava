package endtoend;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Adding elements to the cart -  Amazon 
 * 1. Add the elements into the cart by using dynamic xpath
 * 2. For that use for loop */

public class Addingtocart {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<String> addElements = Arrays.asList("Brocolli", "Cucumber", "Brinjal");
		System.out.println(addElements);

		List<WebElement> vegetables = driver.findElements(By.cssSelector("h4.product-name"));
		
		//not a good practice to use text()-text will be changing based on actions
		int count = 0;
		for (int i = 0; i < vegetables.size(); i++) {
			String productName = vegetables.get(i).getText().split(" ")[0];

			if (addElements.contains(productName)) {
				count++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(count==addElements.size())
					break;
			}
		}

		waitTime();
		driver.quit();
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
