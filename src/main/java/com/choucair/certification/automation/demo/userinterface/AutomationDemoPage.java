package com.choucair.certification.automation.demo.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://demo.automationtesting.in/Register.html")
public class AutomationDemoPage extends PageObject {
	
	public static final Target FIRSTNAME = Target.the("First Name").located(By.xpath("//input[@placeholder='First Name']"));
	public static final Target LASTNAME = Target.the("Last Name").located(By.xpath("//input[@placeholder='Last Name']"));
	public static final Target EMAILADRESS = Target.the("Email Adress").located(By.xpath("//input[@type='email']"));
	public static final Target PHONE = Target.the("Phone").located(By.xpath("//input[@type='tel']"));
	public static final Target GENDER = Target.the("Gender").located(By.xpath("//input[@value='FeMale']"));
	public static final Target COUNTRY = Target.the("Country").located(By.xpath("//select[@id='countries']"));
	public static final Target YEAR = Target.the("Year").located(By.xpath("//select[@id='yearbox']"));
	public static final Target MONTH = Target.the("Month").located(By.xpath("//select[@placeholder='Month']"));
	public static final Target DAY = Target.the("Day").located(By.xpath("//select[@id='daybox']"));
	public static final Target PASSWORD = Target.the("Password").located(By.xpath("//input[@id='firstpassword']"));
	public static final Target CONFIRMPASSWORD = Target.the("Confirm Password").located(By.xpath("//input[@id='secondpassword']"));
	public static final Target BUTTON_SUBMIT = Target.the("Button Submit").located(By.xpath("//button[@id='submitbtn']"));
	
}
