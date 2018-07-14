package com.kaali.com.kaali;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver Driver;
  @Test
  public void f() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver", "F:\\latestgc\\chromedriver.exe");
		Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com");
		Driver.manage().window().maximize();
		Actions act=new Actions(Driver);
		Driver.findElement(By.name("email"));
		Thread.sleep(4000);
		//Driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"a");
	
		
		
		
		
		
  }
}

