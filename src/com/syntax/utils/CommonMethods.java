package com.syntax.utils;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CommonMethods extends BaseClass{

	/**
	 * Method that clears and sends keys
	 * @param element
	 * @param text
	 */
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	/**
	 * Method checks if radio/checkbox is enabled and clicks it
	 * @param radioOrcheckbox
	 * @param value
	 */
	public static void clickRadioOrCheckbox(List<WebElement> radioOrcheckbox, String value) {
		
		String actualValue;
		
		for(WebElement el:radioOrcheckbox) {
			actualValue=el.getAttribute("value").trim();
			if(el.isEnabled()&& actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}
}
