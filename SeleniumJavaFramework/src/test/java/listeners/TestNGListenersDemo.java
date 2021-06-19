package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGListenersDemo {

	@Test
	public void test1(){

		System.out.println("I am inside test1");
	}


	@Test
	public void test2(){
		System.out.println("I am inside test2");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Algoworks");

		//Press enter key on keyboard or clicks on search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

        driver.close();

	}


	@Test
	public void test3(){

		System.out.println("I am inside test3");
		throw new SkipException("This test is skipped");
	}



}
