package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToAUrl {
	public static void main(String[] args){
		
		//Declare a driver variable as a WebDriver and instantiate it as a FirefoxDriver object
		WebDriver driver = new FirefoxDriver();
		
		//I navigate to www.google.com
		driver.get("http://www.google.com/");
	}

}
