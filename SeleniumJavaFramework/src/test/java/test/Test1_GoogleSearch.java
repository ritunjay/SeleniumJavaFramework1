package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
	
		googlesearch();
	}
	
	public static void googlesearch() {
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
	    
	    //go to google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
		
		driver.findElement(By.name("q")).sendKeys("Algoworks");
		
		//Press enter key on keyboard or clicks on search button
		//driver.findElement(By.name("btnk")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		//Close browser
		driver.close();
		
		System.out.println("Test Completed Successfully");

		
	    
	}
	

}
