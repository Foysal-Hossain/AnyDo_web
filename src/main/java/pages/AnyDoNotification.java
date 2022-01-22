package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnyDoNotification {
	private WebDriver driver;
	   
    private By emailId = By.xpath("//input[@type='text']");
    private By clickEmail = By.xpath("//button[@type='submit']");
    private By passWord = By.xpath("//input[@type='password']");
    private By logInBtn = By.xpath("//button[@type='submit']");
    private By continueBtn = By.xpath("//div[contains(text(),'Continue with Email or Apple')]");
    
	 public AnyDoNotification(WebDriver driver) {
	        this.driver = driver;
	    }
	 
	 
	 public void setEmailId(String email){
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	        driver.findElement(emailId).sendKeys(email);
	    }

	    public void clickEmail(){
	        driver.findElement(clickEmail).click();
	    }

	    public void setPassWord(String password){
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	        driver.findElement(passWord).sendKeys(password);
	    }

	    public void clickLogin(){

	        driver.findElement(logInBtn).click();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	    }
	    
	    public void clickContinue() {
	        driver.findElement(continueBtn).click();
	    }

}
