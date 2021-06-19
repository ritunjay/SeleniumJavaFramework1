import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	
	public static void main(String[] srgs) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath : "+projectPath);
		
	    //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\geckodriver\\geckodriver.exe");  
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\latestchromedriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Admin\\workspace\\SeleniumJavaFramework\\drivers\\iedriver\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		
		
		driver.get("http://selenium.dev/");
	}

}
