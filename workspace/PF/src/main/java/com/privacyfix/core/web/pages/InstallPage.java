package com.privacyfix.core.web.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.seleniumemulation.Click;

import com.privacyfix.core.web.Sikuli;
import com.privacyfix.core.web.WebPage;
import com.privacyfix.core.web.elements.Button;

public class InstallPage extends WebPage<InstallPage> {

	private static final String PAGE_URL = "http://privacyfix.com/start/install";
	
	public InstallPage(WebDriver driver) {
		super(driver);
		load();
	}

	@Override
	public InstallPage load() {
		driver.get(PAGE_URL);
		
		return this;
	}

	@Override
	public boolean isAvailable() {
		
		return getLoginButton().isAvailable();
	}

	
	public InstallPage install() throws Exception{

		
		Sikuli sk =  new Sikuli();
	    sk.verifyImage("Images/GetAVGForFree.PNG");
	    getLoginButton().click();
	    try {Thread.sleep(2000);}catch(Exception e){}
		return new InstallPage(driver).waitUntilAvailible();
	}
	
	
	
	private Button getLoginButton(){
		return new Button(driver, By.className("greenButton"));
	}

}

