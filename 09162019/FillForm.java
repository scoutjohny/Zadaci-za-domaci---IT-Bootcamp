package testiranje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement registerButton=driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
		registerButton.click();
		
		WebElement nameBox=driver.findElement(By.xpath("//input[@name='firstName']"));
		nameBox.click();
		nameBox.sendKeys("Dusan");
		
		Thread.sleep(1000);
		driver.quit();

	}

}
