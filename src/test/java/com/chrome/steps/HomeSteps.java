package com.chrome.steps;

import com.chrome.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class HomeSteps {
	HomePage onHomePage;
	
	@Step
	public void open_website() {
		onHomePage.openWebsite();
	}
	
	@Step
	public void scroll_to_footer() {
		onHomePage.scrollToFooter();;
	}
	
	@Step
	public void user_hover_mouse() {
		onHomePage.hoverMouse();
	}
	
	@Step 
	public void user_click_login_button() {
		onHomePage.loginAccount();;
	}
	
	@Step
	public void user_click_create_account() {
		onHomePage.creatAccount();
	}
	
	@Step
	public void user_click_on_login_link() {
		open_website();
		user_hover_mouse();
		user_click_login_button();
	}
	public void user_click_on_create_account_link() {
		open_website();
		user_hover_mouse();
		user_click_create_account();
	}
}
