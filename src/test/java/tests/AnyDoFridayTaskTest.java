package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.AnyDoFriday;

public class AnyDoFridayTaskTest extends BaseClass{
	
	
	@Test
	public void AnyDoFriday() {
		
		AnyDoFriday anyDoFriday = new AnyDoFriday(driver);
		anyDoFriday.clickContinue();
		anyDoFriday.setEmailId("emonafzal35@gmail.com");
		anyDoFriday.clickEmail();
		anyDoFriday.setPassWord("emonafzal35");
		anyDoFriday.clickLogin();
		
		anyDoFriday.clickCreateTask();
		anyDoFriday.setTasklId("My Friday Task");
		anyDoFriday.clickAddTask();
	   
		System.out.println("Friday task created successfully");
	
	}

}
