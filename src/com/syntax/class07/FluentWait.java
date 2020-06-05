package com.syntax.class07;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Function;
import com.syntax.utils.CommonMethods;

public class FluentWait extends CommonMethods {

	public FluentWait(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		/*
		 * Fluent Wait: The fluent wait is used to tell the web driver to wait for a
		 * condition, as well as the frequency with which we want to check the condition
		 * before throwing an "ElementNotVisibleException" exception. 
		 * 
		 * FluentWait wait =new FluentWait(driver); 
		 * wait.withTimeout(Duration.ofSeconds(30));
		 * wait.pollingEvery(Duration.ofSeconds(1));
		 * wait.ignoring(NoSuchElementException.class);
		 */
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		
		wait.pollingEvery(Duration.ofSeconds(1));
		
		wait.ignoring(NoSuchElementException.class);
		
		
		}
	
}

	

	
		
