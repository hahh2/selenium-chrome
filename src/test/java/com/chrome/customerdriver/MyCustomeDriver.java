package com.chrome.customerdriver;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import net.thucydides.core.webdriver.DriverSource;

public class MyCustomeDriver implements DriverSource {

    @Override
    public WebDriver newDriver() {
//        // 1 Profile: work
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.startup.homepage", "http://www.google.com");
//		//profile.setPreference("browser.privatebrowsing.autostart", true);
//		
//		// 2. capabilities
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
//		
//		// 3. FirefoxOptions
//		FirefoxOptions options = new FirefoxOptions(capabilities);
//		//options.addArguments("--headless");
//		 options.addArguments("--width=800");
//		options.addArguments("--height=800");
//		 //options.addArguments("-private");
//		
//		//4. contruction driver
//		return new FirefoxDriver(options);
    	 // 1 profile
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage", "http://www.google.com");
		//profile.setPreference("browser.privatebrowsing.autostart", true);
		
		
		// 2 capaibilities
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		//capabilities.setCapability(FirefoxDriver.PROFILE, profile);
		
		// 3. options
		FirefoxOptions options = new FirefoxOptions(capabilities);
		// options.addArguments("--headless");
		options.addArguments("--width=800");
		options.addArguments("--height=800");
		   options.addArguments("-private");

		// 4. Initialization (constructor ) firefox webdriver 
		return new FirefoxDriver(options);
    }

        @Override
    public boolean takesScreenshots() {
        return true;
    }
}
