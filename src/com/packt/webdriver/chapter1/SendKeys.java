package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys(Keys.chord(Keys.SHIFT, "Selenium WebDriver "));
		searchBox.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		searchBox.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		searchBox.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		searchBox.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		
	}

}
