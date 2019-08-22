package com.chrome.pages;

import com.chrome.mypageobject.MyPageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends MyPageObject {
	
	@FindBy(xpath="//input[@id='email']")
	WebElementFacade emailOrPhone;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElementFacade passWord;
	
	@FindBy(xpath="//button[text()='Đăng nhập' and starts-with(@class,'UserModalstyle')]")
	WebElementFacade btnLogin;
	
	@FindBy(xpath="//div[@class='InputError-xeouh7-0 jTQGhp']")
	WebElementFacade warningMessage;
	 	
	public void enterEmailOrPphone(String keyword) {
		emailOrPhone.type(keyword);
	}
	
	public void enterPaswword(String keyword) {
		highlight(passWord);
		passWord.type(keyword);
	}
	
	public void clichLoginButton() {
		btnLogin.click();
	}
	
	public String getWarningMgs() {
		return warningMessage.getText();
	}
}
