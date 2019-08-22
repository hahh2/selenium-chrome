package com.chrome.pages;

import com.chrome.mypageobject.MyPageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreatAccountPage extends MyPageObject {
	
	MyPageObject myPageObject = new MyPageObject();
	
	@FindBy(xpath="//input[@id='full_name']")
	private WebElementFacade fullName;
	
	@FindBy(xpath="//input[@id='phone_number']")
	private WebElementFacade phoneNumber;
	
	@FindBy(xpath="//input[@id='otp_code']")
	private WebElementFacade otpCode;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElementFacade email;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElementFacade passWord;
	
	@FindBy(xpath="//label[contains(text(), 'Giới tính')]/following::span[1]")
	private WebElementFacade rdGender;
	
	@FindBy(xpath="//button[text()='Tạo tài khoản' and starts-with (@class,'UserModalstyle')] ")
	private WebElementFacade btnCreatAccount;
	
	@FindBy(xpath="//div[text()='Mã xác thực không đúng hoặc đã hết hạn.']")
	private WebElementFacade warningMgs;
	
	@FindBy(xpath="//div[text()='Ngày']")
	private WebElementFacade cbDay;
	
	@FindBy(xpath="//div[text()='Tháng']")
	private WebElementFacade cbMonth;
	
	@FindBy(xpath="//div[text()='Năm']")
	private WebElementFacade cbYear;
	
	@FindBy(xpath="//input[@type='checkbox']/following::span")
	private WebElementFacade receiveInfo;
	
	public void enterFullName(String keyword){
		fullName.type(keyword);
	}
	
	public void enterPhoneNumber(String keyword) {
		phoneNumber.sendKeys(keyword);
	}
	
	public void enterOTPCode(String keyword) {
		otpCode.type(keyword);
	}
	
	public void enterEmail(String keyword) {
		email.type(keyword);
	}
	
	public void enterPassWord(String keyword) {
		passWord.type(keyword);
	}
	
	public void chooseDay(int index) {
		myPageObject.chooseTimes(cbDay, index);
	}
	
	public void chooseMonth(int index){
		myPageObject.chooseTimes(cbMonth, index);
	}
	
	public void chooseYear(int index) {
		myPageObject.chooseTimes(cbYear,index);
	}
	
	public void chooseGender() {
		rdGender.click();
	}
	
	public void receiveInfoFromTiki(){
		receiveInfo.click();
	}
	public void creatAccount() {
		btnCreatAccount.click();
	}
	
	public String getWarnigMessage() {
		return warningMgs.getText();
	}
	
	
}
