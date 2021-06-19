package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	
	public static void main(String[] args) {
		
		SeleniumWaits();
	}
	
	public static void SeleniumWaits(){
		
        String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://www.google.com/");
		
	
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
		//Press enter key on keyboard or clicks on search button
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		
        driver.findElement(By.name("q")).sendKeys("Abcd");
		
		//Close browser
		driver.close();
		driver.quit();
		
	}

}
