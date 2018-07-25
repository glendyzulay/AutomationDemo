package com.choucair.certification.automation.demo.questions;

import com.choucair.certification.automation.demo.userinterface.WebTablePage;

import com.choucair.certification.automation.demo.questions.TheTextResult;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheTextResult  implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		System.out.println(Text.of(WebTablePage.TEXT_RESULT).viewedBy(actor).asString());
		return Text.of(WebTablePage.TEXT_RESULT).viewedBy(actor).asString();
	}
	
	public static TheTextResult is() {
		
		return new TheTextResult();
	}


}
