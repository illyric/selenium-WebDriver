package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetLocation {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		
		//find the position of the searchButton element
		Point searchButtonPosition = searchButton.getLocation();
		System.out.println("The position of the Search Button is: " + searchButtonPosition);		
		
		//get the width and height of the searchButton
		Dimension searchButtonSize = searchButton.getSize();
		System.out.println("The height and width of the Search Button are: " + searchButtonSize);
		
		//get the text of the searchButton
		String searchButtonText = searchButton.getText();
		System.out.println("The text of the Search Button is: " + searchButtonText);

	}

}
