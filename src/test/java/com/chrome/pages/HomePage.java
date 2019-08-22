package com.chrome.pages;

import com.chrome.mypageobject.MyPageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://tiki.vn")
public class HomePage extends MyPageObject {
	@FindBy(xpath="//span[contains(text(),'Đăng nhập')]")
	WebElementFacade loginPage;
	
	@FindBy(xpath="//button[text()='Đăng nhập']")
	WebElementFacade btnLogin;
		
	@FindBy(xpath="//button[text()='Tạo tài khoản']")
	private WebElementFacade btnCreateAccount;
	
	@FindBy(xpath="//a[@href='https://www.facebook.com/tiki.vn/']")
	private WebElementFacade toFB;
	
	public void openWebsite() {
		open();
	}
	
	public void scrollToFooter() {
		open();
		scrollViewElement(toFB);
		highlight(toFB);
	}
	
	public void hoverMouse() {
		//action.moveToElement(loginPage).perform();
		withAction().moveToElement(loginPage).build().perform();
	}
	
	public void loginAccount() {
		btnLogin.waitUntilVisible().click();
	}
	
	public void creatAccount() {
		btnCreateAccount.click();
	}
}
