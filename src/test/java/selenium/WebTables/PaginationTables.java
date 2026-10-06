package selenium.WebTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTables {

	public static void main(String[] args) {
		//table having multiple pages - pagination
		String name;
		String price;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		int pages = Integer.parseInt(driver.findElement(By.xpath("//ul[@class='pagination']/li[last()]")).getText());
		
		int rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody//tr")).size();
		
		for(int j=1; j<=pages; j++) {
			
			if(j>1) {
				driver.findElement(By.xpath("//ul[@class='pagination']/li["+j+"]"));
			}
			
			for(int i=1; i<=rows; i++) {
		
				name = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+i+"]//td[2]")).getText();
				price = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+i+"]//td[3]")).getText();
			
				driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+i+"]//td[4]//input")).click();
				
				System.out.println("Name: "+name+"product: "+price);
			}
			
		}
		driver.close();
		
	}

}
