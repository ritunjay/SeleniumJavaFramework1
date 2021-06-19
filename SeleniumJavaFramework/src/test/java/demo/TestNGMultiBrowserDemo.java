package demo;

import org.apache.xmlbeans.XmlFactoryHook.ThreadContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@Parameters("BrowserName")
	@BeforeTest
	public void setup(String BrowserName){
		System.out.println("Browser name is: " + BrowserName);	
		System.out.println("Thread id: "+Thread.currentThread().getId());

		if(BrowserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
			driver=new ChromeDriver();

		}
		else if(BrowserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");  
			driver = new FirefoxDriver();

		}
		else if(BrowserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void test1() throws Exception{
		driver.get("https://www.google.com/");
		Thread.sleep(5000);

	}

	@AfterTest
	public void teardown(){
		driver.close();
		System.out.println("Test Completed Sucessfully!!!!");

	}


}
