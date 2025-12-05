package selenium.SortingAndPagination;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSorting {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on veg/fruit name column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture the element names (actual sorted order) and store it into the list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> actualList = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the elements of that list (expected)
		List<String> expectedList = actualList.stream().sorted().collect(Collectors.toList());
		
		//compare both lists
		System.out.println(actualList);
		System.out.println(expectedList);
		Assert.assertTrue(actualList.equals(expectedList));
		
		//get the price of the corresponding veggie let's say Beans
		List<String> veggiePrice = elementsList.stream().filter(s->s.getText().contains("Beans"))
														.map(s->getVeggiePrice(s))
														.collect(Collectors.toList());
		
		veggiePrice.stream().forEach(s->System.out.println(s));
		
		driver.quit();

	}

	private static String getVeggiePrice(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
	

}
