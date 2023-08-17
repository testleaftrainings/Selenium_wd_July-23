package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.WelcomePage;

public class TC001_Login extends ProjectSpecificMethods{
	
	@Test
	public void runLogin() {
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername().enterPassword().clickLogin().verifyWelcomePage();
		
		
		//@BeforeMethod --->@Test-->pages(LoginPage) -->flow
		/*
		 * lp.enterUsername(); lp.enterPassword(); lp.clickLogin();
		 * 
		 * 
		 * WelcomePage wp=new WelcomePage(); wp.clickCRMSFA();
		 */
		
	}

}
