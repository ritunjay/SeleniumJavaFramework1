package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		googlesearch();
	}

	public static void googlesearch() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\chromedriver\\chromedriver.exe");  
		driver = new ChromeDriver();

		//go to google.com
		driver.get("https://google.com");

		//enter text in search textbox
		GoogleSearchPage.textbox_search(driver).sendKeys("Algoworks");

		//Press enter key on keyboard or clicks on search button
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);

		//Close browser
		driver.close();

		System.out.println("Test Completed Successfully");



	}


}
