package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemoWithTestNG {

	ExtentSparkReporter htmlReporter;
	ExtentReports extent;

	WebDriver driver;


	@BeforeSuite
	public void setup() {

		htmlReporter = new ExtentSparkReporter("extent.html");

		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void SetUpTest(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
		driver=new ChromeDriver();
	}


	@Test
	public void test1(){


		ExtentTest test = extent.createTest("Google search test one, this is test to validate google search functionality");
		driver.get("https://google.com");
		test.pass("Navigated to google.com");

		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		// info(details)
		test.info("This step shows usage of info(details)");
		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");


	}

	public void test2(){

		ExtentTest test1 = extent.createTest("Google search test one, this is test to validate google search functionality");
		// log(Status, details)
		test1.log(Status.INFO, "This step shows usage of log(status, details)");
		// info(details)
		test1.info("This step shows usage of info(details)");
		// log with snapshot
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		// test with snapshot
		test1.addScreenCaptureFromPath("screenshot.png");

	}


	@AfterTest
	public void tearDownTest(){

		//Close browser
		driver.close();	
		driver.quit();
		System.out.println("Test Completed Successfully");

	}


	@AfterSuite
	public void teardown(){

		// calling flush writes everything to the log file
		extent.flush();

	}
}
