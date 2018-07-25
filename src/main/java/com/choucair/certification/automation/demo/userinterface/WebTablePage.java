package com.choucair.certification.automation.demo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WebTablePage extends PageObject {
	public static final Target WEB_MENU = Target.the("Web Menu").located(By.xpath("//a[contains(text(),'WebTable')]"));
	public static final Target TEXT_RESULT = Target.the("The Result").located(By.xpath("//div//h4[1]"));	
}
