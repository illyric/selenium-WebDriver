package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		
		System.out.println("Name of the button is: " + searchButton.getAttribute("name"));
		System.out.println("Id of the button is: " + searchButton.getAttribute("id"));
		System.out.println("Name of the button is: " + searchButton.getAttribute("name"));
		System.out.println("Class of the button is: " + searchButton.getAttribute("class"));
		System.out.println("Label of the button is: " + searchButton.getAttribute("aria-label"));
		
	}

}
