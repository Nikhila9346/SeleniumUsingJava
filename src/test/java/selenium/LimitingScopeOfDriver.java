package selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingScopeOfDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NBEEREDD\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to get all the links present on the page
		int totalLinkSize = driver.findElements(By.tagName("a")).size();
		System.out.println(totalLinkSize);
		
		//to get all the links present in the footer section (Concept:Limiting scope of the driver)
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		int footerLinkSize = footerDriver.findElements(By.tagName("a")).size();
		System.out.println(footerLinkSize);
				
		//click on every link in column and grab the titles
		WebElement columnLink = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		for(int i=1; i<columnLink.findElements(By.tagName("a")).size();i++) {
			
			String clickOnLink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnLink.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			
		}
		
		String parent = driver.getWindowHandle();
		Set<String> webPages = driver.getWindowHandles();
		
		Iterator<String> it = webPages.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.print(driver.getTitle());
		}
		

	}

}
