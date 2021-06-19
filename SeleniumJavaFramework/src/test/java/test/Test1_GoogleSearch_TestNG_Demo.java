package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class Test1_GoogleSearch_TestNG_Demo {

	WebDriver driver = null;
	public static String browserName = null;

	@BeforeTest
	public void setUpTest(){

		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")){

			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
			driver = new ChromeDriver();	
		}

		else if(browserName.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");  
			driver = new FirefoxDriver();

		}

	}
	@Test
	public void googlesearch() {


		//go to google.com
		driver.get("https://google.com");

		//enter text in search textbox

		driver.findElement(By.name("q")).sendKeys("Algoworks");

		//Press enter key on keyboard or clicks on search button
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

	}

	@AfterTest
	public void tearDownTest(){

		//Close browser
		driver.close();	
		//driver.quit();
		System.out.println("Test Completed Successfully");
		PropertiesFile.getProperties();


	}


}
