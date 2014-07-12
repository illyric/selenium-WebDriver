package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");
		WebElement searchBtn = driver.findElement(By.name("btnK"));
		if(searchBtn.isDisplayed()){
			System.out.println("Oh look, the search button!");
		}else{
			System.out.println("How am I supposed to search without a search button?");
		}
	}

}
