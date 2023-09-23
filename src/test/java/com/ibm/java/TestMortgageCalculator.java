package com.ibm.java;

import static org.testng.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMortgageCalculator {
	
	private WebDriver driver;
	
	@BeforeClass
	public void setupDriver() {
		//descarcati driver specific, apoi update la pathToDriver
		String pathToDriver = "/Users/ionut/workspace/trainings/ibm-java/src/test/resources/chromedriver";
		System.setProperty("webdriver.chrome.driver", pathToDriver);
		
		ChromeOptions options = new ChromeOptions()
			                        //.addArguments("--headless") sa nu mai deschida Chrome
			                        .addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
	@Test
	public void testMonthlyPayment() throws InterruptedException {
		//Given
		driver.navigate()
		      .to("https://www.calculator.net/mortgage-payoff-calculator.html");
		driver.manage()
		      .window()
		      .maximize();
		
		WebElement input = driver.findElement(By.name("cloanamount"));
		input.clear();
		input.sendKeys("50000");
		Thread.sleep(1500);
		
		WebElement input2 = driver.findElement(By.name("cloanterm"));
		input2.clear();
		input2.sendKeys("25");
		Thread.sleep(1500);
		
		WebElement input3 = driver.findElement(By.name("cinterestrate"));
		input3.clear();
		input3.sendKeys("6");
		Thread.sleep(1500);
		
		WebElement input4 = driver.findElement(By.id("cremainingyear"));
		input4.clear();
		input4.sendKeys("25");
		Thread.sleep(1500);
		
		WebElement input5 = driver.findElement(By.id("cremainingmonth"));
		input5.clear();
		input5.sendKeys("0");
		Thread.sleep(1500);
		
		LinkedList<WebElement> radios = new LinkedList<>(driver.findElements(By.xpath("//span[contains(@class, 'rbmark')]")));
		radios.getFirst().click();
		Thread.sleep(1500);
		
		//When
		WebElement button = driver.findElement(By.xpath("//input[contains(@value, 'Calculate')]"));
		button.click();
		Thread.sleep(1500);
		
		//Then
		WebElement monthlyPayElement = driver.findElement(By.xpath("//td[contains(@class, 'cinfoBodL')]"));
		String actualMonthlyPay = monthlyPayElement.getText();
		String expectedMonthlyPay = "$322.15";
		
		assertEquals(actualMonthlyPay, expectedMonthlyPay);
	}
}
