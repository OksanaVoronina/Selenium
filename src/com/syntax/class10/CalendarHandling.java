package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.CommonMethods;

public class CalendarHandling extends CommonMethods{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://queryul.com/");
		
		WebElement datePickerLink = driver.findElement(By.xpath("//a[text()='Datepicker']"));
		wait(2);
		datePickerLink.click();
		WebElement frame = driver.findElement(By.className("deso-frame"));
		driver.switchTo().frame(frame);
		wait(2);
		
		WebElement calendar=driver.findElement(By.id("datepicker"));
		//click calendar
		calendar.click();
		
		String departureMonth ="August 2020";
		WebElement month=driver.findElement(By.xpath("//div[@class='ul-datepicker-title']"));
		WebElement nextButton=driver.findElement(By.xpath("//span[text()='Next']"));
		boolean flag=true;
		while(true) {
			String monthText=month.getText();
		}
	}

}
