package com.choucair.certification.automation.demo.tasks;

import java.util.List;

import com.choucair.certification.automation.demo.interactions.Select;
import com.choucair.certification.automation.demo.interactions.SelectThe;
import com.choucair.certification.automation.demo.model.RegistrationForm;
import com.choucair.certification.automation.demo.userinterface.AutomationDemoPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromTarget;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.questions.SelectedValue;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterOnThePage implements Task {
	
	private List<RegistrationForm> registrationData;
	
	public RegisterOnThePage(List<RegistrationForm> registrationData) {
		this.registrationData = registrationData;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		for (RegistrationForm registrationForm : registrationData) {
			actor.attemptsTo(Enter.theValue(registrationForm.getFirstName()).into(AutomationDemoPage.FIRSTNAME));
			actor.attemptsTo(Enter.theValue((registrationForm.getLastName())).into(AutomationDemoPage.LASTNAME));
			actor.attemptsTo(Enter.theValue(registrationForm.getAddress()).into(AutomationDemoPage.ADDRESS));
			actor.attemptsTo(Enter.theValue((registrationForm.getEmailAdress())).into(AutomationDemoPage.EMAILADRESS));
			actor.attemptsTo(Enter.theValue((registrationForm.getPhone())).into(AutomationDemoPage.PHONE));
			actor.attemptsTo(Click.on(AutomationDemoPage.GENDER));
			actor.attemptsTo(Click.on(AutomationDemoPage.HOBBIES));
			actor.attemptsTo(Select.theElement(registrationForm.getLanguages(), AutomationDemoPage.LANGUAGES));
			actor.attemptsTo(SelectFromOptions.byVisibleText(registrationForm.getSkills()).from(AutomationDemoPage.SKILLS));
			actor.attemptsTo(SelectFromOptions.byVisibleText(registrationForm.getCountry()).from(AutomationDemoPage.COUNTRY));
			actor.attemptsTo(SelectThe.Country(registrationForm.getSelectCountry(), AutomationDemoPage.SELECT_COUNTRY));
			actor.attemptsTo(SelectFromOptions.byVisibleText(registrationForm.getYear()).from(AutomationDemoPage.YEAR));
			actor.attemptsTo(SelectFromOptions.byVisibleText(registrationForm.getMonth()).from(AutomationDemoPage.MONTH));
			actor.attemptsTo(SelectFromOptions.byVisibleText(registrationForm.getDay()).from(AutomationDemoPage.DAY));
			actor.attemptsTo(Enter.theValue(registrationForm.getPassword()).into(AutomationDemoPage.PASSWORD));
			actor.attemptsTo(Enter.theValue(registrationForm.getPassword()).into(AutomationDemoPage.CONFIRMPASSWORD));
			actor.attemptsTo(Click.on(AutomationDemoPage.BUTTON_SUBMIT));
		}		
	}

	public static RegisterOnThePage conLaInfoDe(List<RegistrationForm> registrationData) {
		
		return instrumented(RegisterOnThePage.class, registrationData);
	}
	
	

}
