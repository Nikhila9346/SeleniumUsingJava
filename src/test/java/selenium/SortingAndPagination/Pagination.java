package selenium.SortingAndPagination;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//get the price of the corresponding veggie let's say Potato - Pagination
		//Pagination - automating navigation
		List<String> veggiePrice = new ArrayList<>();
				
		while(veggiePrice.size()<1) {
					
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			List<WebElement> elementsLists = driver.findElements(By.xpath("//tr/td[1]"));
					
			veggiePrice = elementsLists.stream().filter(s->s.getText().contains("Potato"))
												.map(s->getVeggiePrice(s))
												.collect(Collectors.toList());
			
			if(veggiePrice.size()<1) {
				driver.findElement(By.xpath("//a[@aria-label=\"Next\"]")).click();
			}
		}
		
		veggiePrice.stream().forEach(s->System.out.println(s));
		
		driver.quit();
	}
	
	private static String getVeggiePrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
