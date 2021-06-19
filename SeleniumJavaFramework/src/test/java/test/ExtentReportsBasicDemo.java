package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsBasicDemo {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReports.html");
		
        // create ExtentReports and attach reporter(s)
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google search test one, this is test to validate google search functionality");
	
        String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    
	    test1.log(Status.INFO, "Starting Test Case");
	    
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");
		
		driver.findElement(By.name("q")).sendKeys("Algoworks");
		test1.pass("Entered text in Searchbox");
		
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		test1.pass("Press keyboard enter key");
        
		//Close browser
		driver.close();
		driver.quit();
		test1.pass("Close the broser");
		
        test1.info("Test Completed !!!!!!!!!!!");
        
     // calling flush writes everything to the log file
        extent.flush();
	}

}
