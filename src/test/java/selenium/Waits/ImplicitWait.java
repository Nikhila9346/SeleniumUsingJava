package selenium.Waits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
//		implicit wait - global wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//Adding elements to the cart
		List<String> addElements = Arrays.asList("Brocolli", "Cucumber", "Brinjal");

		List<WebElement> vegetables = driver.findElements(By.cssSelector("h4.product-name"));
		addToCart(driver, addElements, vegetables);
		
		//applying the coupon code
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		driver.quit();
	}
	
	public static void addToCart(WebDriver driver, List<String> addElements, List<WebElement> vegetables) {
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
	}
	

}
