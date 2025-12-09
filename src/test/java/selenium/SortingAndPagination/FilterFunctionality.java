package selenium.SortingAndPagination;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterFunctionality {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Search functionality - the elements displayed should contain the search element name
		
		//1. Enter the veggie name
		//2. Extract the filters name
		//3. check the filters having the search veggie name
		String searchName = "Ch";
		driver.findElement(By.cssSelector("[id=\"search-field\"]")).sendKeys(searchName);
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> veggiesList = veggies.stream().map(s->s.getText()).collect(Collectors.toList());
		//check whether the veggies displayed contains 'Ch' token in it
		List<String> matchNames = veggies.stream().map(s->s.getText()).filter(s->s.contains(searchName)).collect(Collectors.toList());
		
		System.out.println(veggiesList + " and " + matchNames);
		Assert.assertTrue(veggiesList.equals(matchNames));
		
		driver.quit();
	}

}
