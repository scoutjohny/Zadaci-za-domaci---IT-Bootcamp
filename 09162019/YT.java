package testiranje;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YT {
	private static final String SEARCH_XPATH="//input[@id='search']";
	private static final String SEARCHBUTTON_XPATH="//yt-icon[@class='style-scope ytd-searchbox']";

		private static final String YTURL="https://www.youtube.com";
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.get(YTURL);
			WebElement wb=driver.findElement(By.xpath(SEARCH_XPATH));
			wb.click();
			wb.sendKeys("Rick Astley");
			driver.findElement(By.xpath(SEARCHBUTTON_XPATH)).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'Rick Astley - Never Gonna Give You Up (Video)')]")).click();
			Thread.sleep(2000);
			driver.quit();
		}

}
