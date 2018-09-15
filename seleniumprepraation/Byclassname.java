package seleniumprepraation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Byclassname {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		String r="https://learn.letskodeit.com/p/practice";
		driver.get(r);
		driver.findElement(By.className("inputs")).sendKeys("O..Hello");
		
		

	}

}
