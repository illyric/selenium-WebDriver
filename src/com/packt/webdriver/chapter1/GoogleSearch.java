package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
	public static void main(String[] args){
		
		//this code snippet opens Firefox Browser and searches for "ZAG apps"
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("http://www.google.com");
		WebElement searchBox = webdriver.findElement(By.name("q"));
		searchBox.sendKeys("ZAG apps");
		searchBox.submit();
		
	}

}
