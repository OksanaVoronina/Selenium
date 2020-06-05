package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class ElementCommands extends BaseClass{
	
	WebElement element=driver.findElement(By.id("userName"));
	//element.sendkeys("SyntaxTechs");
	
	//or can be written as 
	//driver.findElement(By.id("userName")).sendKeys("SyntaxTech").

}
