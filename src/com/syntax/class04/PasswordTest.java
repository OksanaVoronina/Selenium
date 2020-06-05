package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("url");
		
	    //String userName=driver.findElement(By.xpath("//input[contains(@id, 'username']"));
		//userName.sendKeys(userName);
		//Thread.sleep(3000);
		//userName.sendKeys(userName);
		
		WebElement pass=driver.findElement(By.cssSelector("input[name*='spassword']"));
		pass.clear();
		Thread.sleep(3000);
		pass.sendKeys("password");
		
		WebElement loginBtn =driver.findElement(By.cssSelector("input[value='Login']"));
		loginBtn.click();
		
		boolean logoIsDisplayed=driver.findElement(By.xpath("h1[text()='web Orders']")).isDisplayed();
		if(logoIsDisplayed) {
			System.out.println("Logo is displayed, test case passed");
		}
		
	
		

	}

}
