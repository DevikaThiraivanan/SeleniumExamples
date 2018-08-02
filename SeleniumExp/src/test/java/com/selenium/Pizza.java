package com.selenium;

import java.util.List;

 
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pizza {

	WebDriver driver;

	Logger logger = Logger.getLogger(Pizza.class.getName());
	@Test
	public void ExampleForPizza() {

		try {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Srinivas_Trainer\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8888/SeleniumDemo/pitza.html");
			Thread.sleep(2000);
			WebElement element=driver.findElement(By.id("sel"));
			Select se=new Select(element);
			se.selectByVisibleText("Tomato");
			se.selectByVisibleText("Panner");
			
			List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions)
			{
			//System.out.println("You have selected ::"+ webElement.getText());
				logger.info(""+webElement.getText());
				
			}
					 
			logger.info("done");
			

		} catch (Exception e) {

		}

		finally {
			driver.close();
			logger.info("Closed");
		}

	}

	
}
