package com.seleniumcucmber.app.salesforce.login;

import org.junit.Assert;

import com.seleniumcucmber.app.salesforce.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginScenario {
	
	WebConnector selenium= WebConnector.getInstance();
	
	@Given ("^I go to \"([^\"]*)\" on \"([^\"]*)\"$")
	public void I_GO_TO_Salesforce(String url,String browser)
	{
		System.out.println("I am going to " + url +" on "+ browser);
		 selenium.openBrowser(browser);
		 selenium.navigate(url);
	}
	
	@And("^I enter \"([^\"]*)\" as \"([^\"]*)\"$")
	
	public void I_enter(String object,String text)
	
	{
		System.out.println("Entering in"+ object + "value" + text);
		selenium.type(text, object);
   }
	
	@And("^I click on \"([^\"]*)\"$")
	
	public void I_click_on(String object)
	
	{
		System.out.println("Clicking on " + object);
		selenium.click(object);
		
	}
	
	@Then("^Login should be \"([^\"]*)\"$")
	
	public void Then_login_should_be(String expectedResult)
	
	{
		System.out.println("Login run-" +expectedResult);
		boolean result=selenium.isElementPresent("searchText");
		String actualresult=null;
		
		if (result)
			actualresult="success";
		else
			actualresult="failure";
		
		//Assert.assertArrayEquals(expectedResult, actualresult);
		Assert.assertEquals(expectedResult, actualresult);
	}
	
	
}
