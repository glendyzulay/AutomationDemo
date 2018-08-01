package com.choucair.certification.automation.demo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class SelectThe implements Interaction {
	private String country;
	private Target option; 
	
	public SelectThe (String country, Target option) {
		this.country = country;
		this.option = option;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		List<WebElement> listaObjetos = option.resolveFor(actor).findElements(By.tagName("option"));
		
		for (WebElement selectElement : listaObjetos) {
			System.out.println(selectElement.getText());
			if (selectElement.getText().equals(country)) {
				System.out.println(selectElement.getText());
				selectElement.click();
				break;
			}
			
		}
		
	}

	public static SelectThe Country(String country, Target selectCountry) {
		return instrumented(SelectThe.class, country, selectCountry);
	}

}
