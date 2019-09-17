package testiranje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//1. tacka
		WebDriver driver = new ChromeDriver();
		
		
		
		//2. tacka
		String url = "http://newtours.demoaut.com/";
		driver.get(url);
		
		//3. tacka
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		String tUrl="http://newtours.demoaut.com/mercuryregister.php";
		if(driver.getCurrentUrl().contains(tUrl))System.out.println("All good!");
		//4.tacka
		driver.navigate().back();
		
		//5.tacka
		driver.navigate().forward();
		
		//6.tacka
		url="http://www.google.com";
		driver.navigate().to(url);
		
		//7. tacka
		driver.navigate().refresh();
		
		//8.tacka
		driver.close();
	}

}
