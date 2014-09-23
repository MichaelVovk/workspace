package com.privacyfix.core;

import static com.privacyfix.core.DriverMaster.getDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;







public abstract class BaseTest {

	protected static WebDriver driver;
	
	
	@BeforeSuite(alwaysRun = true)
	
	
	
	@Parameters ({"browser"})
	public void setUp(@Optional("firefox") String browser){
	driver = getDriver(browser);
		

	}    
		
	@AfterSuite(alwaysRun = true)
	public void tearDown(){
		//driver.quit();
		
	}
	
}
