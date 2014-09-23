package com.privacyfix.tests;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.privacyfix.core.BaseTest;
import com.privacyfix.core.Swing;
import com.privacyfix.core.web.Sikuli;
import com.privacyfix.core.web.pages.InstallPage;
import com.privacyfix.core.Logger;



public class FirstTest extends BaseTest  {

	


	

	@Test
	public void testMethod() throws Exception{
		new InstallPage(driver).install();

		//	driver.get("http://privacyfix.com");						
	//	try {Thread.sleep(2000);}catch(Exception e){}
	//	Sikuli cm =  new Sikuli();
	//	cm.verifyImage("Images/capture.png");
		
		
	//	Logger.writeLog("TC Failed");
		//Logger.writeLog("TC Failed2");
		
	}
	

	
}

