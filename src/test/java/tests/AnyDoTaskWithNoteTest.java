package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.AnyDoCreateTask;
import pages.AnyDoCreateWithNotes;

public class AnyDoTaskWithNoteTest extends BaseClass {
 
	
	@Test
	public void anyDoTaskWithNote() {
		
	
		        AnyDoCreateWithNotes anyDoTaskWithNote = new AnyDoCreateWithNotes(driver);
		        anyDoTaskWithNote.clickContinue();
		        anyDoTaskWithNote.setEmailId("emonafzal35@gmail.com");
		        anyDoTaskWithNote.clickEmail();
		        anyDoTaskWithNote.setPassWord("emonafzal35");
		        anyDoTaskWithNote.clickLogin();
	
		        anyDoTaskWithNote.clickCreateTask();
		        anyDoTaskWithNote.clickNotes();
		        anyDoTaskWithNote.clickAddTask();
			   
				System.out.println("create Task With Notes successfully");
			
	}
}
