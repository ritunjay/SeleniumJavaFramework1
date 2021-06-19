package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		GoogleSearchTest();
		
	}
	
	public static void GoogleSearchTest(){
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
	    driver = new ChromeDriver();
			    
	    GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
	    driver.get("https://google.com");
	    
	    searchPageObj.setTextInSearch("Steady Rabbit");
	    searchPageObj.clickSearchButton();
	    driver.close();
		
	}
	

}
