package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	} 
	
	public static void test() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();

		driver.get("https://ufile.io/");
		driver.findElement(By.id("upload-window")).click();
		
		Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
		Thread.sleep(3000);
		//driver.close();
	}

}
