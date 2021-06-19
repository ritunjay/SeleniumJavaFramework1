package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPageObjects {
	
	   WebDriver driver = null;

       By Search_text = By.name("q");
       By button_text = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");

       public GoogleSearchPageObjects(WebDriver driver){
    	   this.driver = driver;
       }
       
       
       public void setTextInSearch(String text){
    	   driver.findElement(Search_text).sendKeys(text);
       }
       
       
       public void clickSearchButton(){
    	   driver.findElement(button_text).sendKeys(Keys.RETURN);
       }

       
       
}

