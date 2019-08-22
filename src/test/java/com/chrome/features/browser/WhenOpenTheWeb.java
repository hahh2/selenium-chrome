package com.chrome.features.browser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.chrome.steps.HomeSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;

@RunWith(SerenityRunner.class)
public class WhenOpenTheWeb {
	
	@Managed
	WebDriver driver;
	@Steps
	HomeSteps homeSteps;
	@Test
	@WithTag("openweb")
	public void user_open_the_web() {
		homeSteps.open_website();
	}
}
