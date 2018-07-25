package com.choucair.certification.automation.demo.stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import com.choucair.certification.automation.demo.model.RegistrationForm;
import com.choucair.certification.automation.demo.questions.TheTextResult;
import com.choucair.certification.automation.demo.tasks.OpenTheBrowser;
import com.choucair.certification.automation.demo.tasks.RegisterOnThePage;
import com.choucair.certification.automation.demo.userinterface.AutomationDemoPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class AutomationDemoDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor glendy = Actor.named("Glendy");
	private AutomationDemoPage automationDemoPage;
	
	@Before
	public void setup() {
		glendy.can(BrowseTheWeb.with(herBrowser));
	}
	
	
	@Given("^that (.*) opens her browser at (.*)$")
	public void TheUserOpensHerBrowserAtAutomationDemoPage(String name, String webpage) throws Exception {
		glendy.wasAbleTo(OpenTheBrowser.at(automationDemoPage));
	}

	@When("^she performs the registration$")
	public void TheUserPerformsTheRegistration(List<RegistrationForm> registrationData) throws Exception {
		glendy.attemptsTo(RegisterOnThePage.conLaInfoDe(registrationData));
	}
	
	@Then("^she should see the words (.*) in the screen$")
	public void TheUserShouldSeeTheExpectedWordInTheScreen(String expectedWord) throws Exception {
		glendy.should(seeThat(TheTextResult.is(),equalTo(expectedWord)));	    
	}
}
