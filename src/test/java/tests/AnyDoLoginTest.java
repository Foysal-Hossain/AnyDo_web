package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AnyDoLogin;


public class AnyDoLoginTest extends BaseClass{
	
	    @Test
	    public void logInSuccess(){
		    
				AnyDoLogin anyDoLogin = new AnyDoLogin(driver);
				anyDoLogin.clickContinue();
				anyDoLogin.setEmailId("emonafzal35@gmail.com");
				anyDoLogin.clickEmail();
				anyDoLogin.setPassWord("emonafzal35");
				anyDoLogin.clickLogin();
               
				
			
	    }

}
