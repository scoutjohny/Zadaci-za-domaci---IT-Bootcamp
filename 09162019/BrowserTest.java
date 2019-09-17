package testiranje;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrowserTest {
	@Test
	public void testURL() {
/*
		WebDriver driver = new ChromeDriver();
		try {

			String url = "http://www.store.demoqa.com";
			driver.get(url);
			//3.tacka
			String title = driver.getTitle();
			int titlelength = title.length();
			
			//4. tacka
			System.out.println("Title is: " + title);
			System.out.println("Title length is: " + titlelength);
			//6. tacka
			String pageSource = driver.getPageSource();
			int pageSourceLength = pageSource.length();
			
			//7.tacka
			System.out.println("Page Source length is: " + pageSourceLength);
			
			Assert.assertEquals(driver.getCurrentUrl(), url);

		} catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		} finally {
			driver.quit();
		}
		
		*/
	}
	
	@Test
	public void testRegister() {
		WebDriver driver = new ChromeDriver();
		try {
			
			
			
			
			//2. tacka
			String url = "http://newtours.demoaut.com/";
			driver.get(url);
			
			//3. tacka
			driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
			String tUrl="http://newtours.demoaut.com/mercuryregister.php";
			Assert.assertTrue(driver.getCurrentUrl().contains(tUrl));
			System.out.println("Test register all good!");
			//4.tacka
			driver.navigate().back();
			
			//5.tacka
			driver.navigate().forward();
			
			//6.tacka
			driver.navigate().to(url);
			
			//7. tacka
			driver.navigate().refresh();
		}catch (AssertionError ae) {
			Assert.fail();
			System.out.println(ae.getMessage());
		} finally {
			driver.quit();
		}
	}
}
