package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
	
	public static void main(String[] args) {
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.close();
		
	}

}
