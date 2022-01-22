package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.BaseClass;
import junit.framework.Assert;
import pages.AnyDoCreateTask;
import pages.AnyDoNotification;

public class AnyDoNotificationTest extends BaseClass{
	
	
	
	
	@Test
	public void notification() {
		
	
		       AnyDoNotification anyDoNotification = new AnyDoNotification(driver);
		       anyDoNotification.clickContinue();
		       anyDoNotification.setEmailId("emonafzal35@gmail.com");
		       anyDoNotification.clickEmail();
		       anyDoNotification.setPassWord("emonafzal35");
		       anyDoNotification.clickLogin();
	  
				WebElement notification = driver.findElement(By.className("NotificationBarProvider__closeButton"));
				Assert.assertEquals(true, notification.isDisplayed());
				System.out.println("notification logo is displayed passed");
			
	}

}
