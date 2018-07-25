package com.seleniumcucmber.app.salesforce.testcases;

import org.junit.Assert;

import com.seleniumcucmber.app.salesforce.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MenuTest {

	
	WebConnector selenium=WebConnector.getInstance();
	
	@Given("^I am logged in \"([^\"]*)\"$")
	public void  I_am_logged_in(String browser){
		
		selenium.openBrowser(browser);
		if(!selenium.isLoggedIn()){
			
			selenium.doDefaultLogin();
			
		}
		
	}
/*
	@And("^I click on \"([^\"]*)\"$")
	public void I_click_on(String object)
	{
		selenium.click(object);
		
	}*/
	
	@And("^\"([^\"]*)\" element should be present$")
	public void Element_should_be_present(String object)
	{
		Assert.assertTrue("Object not found"+object, selenium.isElementPresent(object));
	}
}
