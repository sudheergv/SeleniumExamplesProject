package com.selenium.ex.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class BrowserProfileSetting {

	WebDriver driver;

	@Test
	public void testExamples() {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://www.google.com");
		driver = new FirefoxDriver();

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("100");
	}
}
/**
 * type 'about:config' in the opened browser
 * and verify the key which is set with the google page
 */


