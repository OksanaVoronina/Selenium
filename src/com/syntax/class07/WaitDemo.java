package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class WaitDemo {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//WebDriver driver = BaseClass.setUp();
	driver.get("http://u9itestpractice.com/Students/Contact");
	driver.manage().window().fullscreen();
	
	boolean isHomeDis = driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
	System.out.println("Is Home Link Displayed  "+isHomeDis);
	Thread.sleep(3000);
	
	//Implicit wait is a kind of global wait and it will wait for each and every element in your program
	//It waits for the element to be found, meaning, it will work for findElement(): and
	//findElements(); methods only. As soon as it is found, the remaining time is ignored
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("This is a Ajax link")).click();
	String text=driver.findElement(By.className("ContactUs")).getText();
	System.out.println(text);
	
	
	
	
	}

}
