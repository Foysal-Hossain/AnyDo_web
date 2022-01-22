package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver driver;

	    @BeforeClass
	    public void setUP(){

	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	        driver.get("https://desktop.any.do/");
	        driver.manage().window().maximize();
           System.out.println("setup");
	       

	    }

	    
	    
	   
	    @AfterClass
	    public void tearDown(){
	        driver.close();
	    }

  
}
