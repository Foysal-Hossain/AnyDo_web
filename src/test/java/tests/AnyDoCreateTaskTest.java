package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AnyDoCreateTask;


public class AnyDoCreateTaskTest extends BaseClass {

	
	@Test
	public void createTask() {
		
	
				AnyDoCreateTask anyDoCreateTask = new AnyDoCreateTask(driver);
				anyDoCreateTask.clickContinue();
				anyDoCreateTask.setEmailId("emonafzal35@gmail.com");
				anyDoCreateTask.clickEmail();
				anyDoCreateTask.setPassWord("emonafzal35");
				anyDoCreateTask.clickLogin();
	
				anyDoCreateTask.clickCreateTask();
				anyDoCreateTask.setTasklId("My daily Task");
				anyDoCreateTask.clickAddTask();
			   
				System.out.println("create task successfully");
			
	}
}
