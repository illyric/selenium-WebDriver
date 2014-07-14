package com.packt.webdriver.chapter2;

import java.awt.EventQueue;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionBuildPerform {
	
	public ActionBuildPerform(){
		
	}
	
	public static void goToGoogle(WebDriver driver){
		driver.get("http://www.google.com");
	}
	
	
	
	
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/ilirk/Desktop/8850OS_Code/Chapter%202/HTML/Selectable.html");
		List<WebElement> elements = driver.findElements(By.tagName("li"));		
		
		//Tread to redirect to google after 5 seconds (just for fun)
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thread.sleep(5000);
					//WebDriver driver = new FirefoxDriver();
					goToGoogle(com.packt.webdriver.chapter2.ActionBuildPerform.driver);
					System.out.println("It worked!");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//Creating actions 
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL)
			.click(elements.get(0))
			.click(elements.get(2))
			.click(elements.get(4))
		.keyUp(Keys.CONTROL);		
		
		//create composite action
		Action compositeAction = builder.build();
		
		//perform the composite action
		compositeAction.perform();
		
		/*This can also be achieved using directly
		 * builder.perform();
		 * The perform() method calls internally 
		 * the build() method
		 * */
		
	}

}
