package com.packt.webdriver.chapter1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
	public static void main(String[] args){
		
		//this code snippet opens Firefox Browser and searches for "Software Automation wikipedia"
		WebDriver webdriver = new FirefoxDriver();
		webdriver.get("http://www.google.com");
		WebElement searchBox = webdriver.findElement(By.name("q"));
		searchBox.sendKeys("Software Automation wikipedia");
		searchBox.submit();
		
		//Search for all the buttons on the page
//		List<WebElement> buttons = webdriver.findElements(By.tagName("button"));
//		System.out.println("The number of buttons found: " + buttons.size());
		
		//Search for the "Test" linkText
		List<WebElement> resultLinks = webdriver.findElements(By.xpath("//div/a"));
		
		
	}

}
