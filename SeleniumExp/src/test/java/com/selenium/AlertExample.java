package com.selenium;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	WebDriver driver;

	Logger logger = Logger.getLogger(AlertExample.class.getName());

	@Test
	public void ExampleForAlert() {

		try {

			System.setProperty("webdriver.chrome.driver", "D:\\Srinivas_Trainer\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.get("http://localhost:8888/SeleniumDemo/Alerts.html");
			driver.get("https://www.google.co.in");
			Thread.sleep(2000);
			/*driver.findElement(By.xpath("//button[@onclick=" + "'alertFunction()']")).click();
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			
*/
			
			driver.findElement(By.id("lst-ib")).sendKeys("Dipyaman Sen");
			driver.findElement(By.name("btnK")).click();
			
			logger.info("Done");
		} catch (Exception e) {

		}

		finally {
			// driver.close();
			logger.info("Closed");
		}

	}

}
