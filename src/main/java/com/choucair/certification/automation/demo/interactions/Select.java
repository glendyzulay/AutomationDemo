package com.choucair.certification.automation.demo.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.WebElement;

public class Select implements Interaction {
	
	
	private String languages;
	private Target elemento; 
	
	public Select (String languages, Target elemento) {
		this.languages = languages;
		this.elemento = elemento;
	}	
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(elemento));
		List<WebElement> listaObjetos = elemento.resolveFor(actor).findElements(By.tagName("li"));
		
		for (WebElement selectElement : listaObjetos) {
			System.out.println(selectElement.getText());
			if (selectElement.getText().equals(languages)) {
				System.out.println(selectElement.getText());
				selectElement.click();
				break;
			}
			
		}
		
	}
	
	public static Select theElement(String languages, Target elemento) {
		return instrumented(Select.class, languages, elemento);
	}
	
	

}
