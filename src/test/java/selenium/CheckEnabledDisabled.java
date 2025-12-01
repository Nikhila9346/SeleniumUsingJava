package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckEnabledDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		//before clicking on round trip button
		getResult(driver.findElement(By.cssSelector("div[class='picker-second']")).getDomAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//after clicking on round trip button
		getResult(driver.findElement(By.cssSelector("div[class='picker-second']")).getDomAttribute("style"));
		
	}
	
	public static void getResult(String styleValue) {
		if(styleValue.contains("1")) {
			System.out.println("Enabled");
		}
		else {
			System.out.println("Disabled");
		}
	}

}