import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	public SnapDeal() {
		
	}
	
	String url ="https://www.snapdeal.com";
	String SignInXpath ="//span[text()='Sign In']";
	String LogInXpath ="//a[text()='login']";
	String EmailFeidID ="username";
    
      
    	
    	 ChromeDriver driver= new ChromeDriver();
  
         public void launchSnapDeal() {
        	driver.get(url);
        	driver.findElement(By.xpath(SignInXpath)).click();
        	driver.findElement(By.xpath(LogInXpath)).click();
        	driver.switchTo().frame("loginIframe");
        	driver.findElement(By.id(EmailFeidID)).sendKeys("snaptest@ty.com");
        	
         }
         public static void main(String[] args) {
			SnapDeal snap = new SnapDeal();
			snap.launchSnapDeal();
		}
         
                 }

      
    

