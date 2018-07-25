package com.seleniumcucmber.app.salesforce.login;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin ={"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},features="src\\main\\resources\\com\\seleniumcucmber\\app\\salesforce\\testcases\\Menu.feature",glue={"com.seleniumcucmber.app.salesforce.testcases"})
public class LoginRunnerTest {

}
