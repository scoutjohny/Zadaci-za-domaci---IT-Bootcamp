package testiranje;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * /html[1]/body[1]/div[2]/section[1]
		 * 
		 * */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//1. tacka
		WebDriver driver = new ChromeDriver();
		
		
		
		//2. tacka
		String url = "http://www.store.demoqa.com";
		driver.get(url);
		
		//3.tacka
		String title = driver.getTitle();
		int titlelength = title.length();
		
		//4. tacka
		System.out.println("Title is: " + title);
		System.out.println("Title length is: " + titlelength);
		
		//5.tacka
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals(url)){
			System.out.println("Correct page is opened");
		}
		else {
			System.out.println("Incorrect page is opened");
			System.out.println("Actual url is: " + actualUrl);
			System.out.println("Expected url is: " + url);
		}
		
		//6. tacka
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		
		//7.tacka
		System.out.println("Page Source length is: " + pageSourceLength);
		
		//8.tacka
		driver.close();	

	}

}
