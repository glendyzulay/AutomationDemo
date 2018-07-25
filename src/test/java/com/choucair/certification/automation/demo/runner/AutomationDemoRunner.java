package com.choucair.certification.automation.demo.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
				features = "src/test/resources/features/automation_demo.feature",
				glue = "com.choucair.certification.automation.demo.stepdefinitions"
		)
public class AutomationDemoRunner {

}
