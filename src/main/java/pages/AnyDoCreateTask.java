package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnyDoCreateTask {
	private WebDriver driver;

	private By emailId = By.xpath("//input[@type='text']");
	private By clickEmail = By.xpath("//button[@type='submit']");
	private By passWord = By.xpath("//input[@type='password']");
	private By logInBtn = By.xpath("//button[@type='submit']");
	private By continueBtn = By.xpath("//div[contains(text(),'Continue with Email or Apple')]");

	private By clickCreateBtn = By.xpath("//button[contains(text(),'Create a task')]");
	private By taskId = By.xpath("//*[@id=\"root\"]/div[4]/div/div/div/div/div[2]/div/div[1]/div/input");
	private By continueWithTaskId = By.xpath("//button[contains(text(), 'Continue')]");

	public AnyDoCreateTask(WebDriver driver) {
		this.driver = driver;
	}

//    login
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

	    }
	    
	    public void clickContinue() {
	        driver.findElement(continueBtn).click();
	    }
	    

//    end login

	public void clickCreateTask() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(clickCreateBtn).click();
		
	}

	public void setTasklId(String task) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(taskId).sendKeys(task);

	}

	public void clickAddTask() {
		driver.findElement(continueWithTaskId).click();
	}

}
