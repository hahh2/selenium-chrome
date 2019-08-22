package com.chrome.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.chrome.models.AccountInfo;
import com.chrome.pages.CreatAccountPage;

import net.thucydides.core.annotations.Step;

public class CreatAccountSteps {
	CreatAccountPage creatAccount;
	
	@Step
	public void enter_full_name(String keyword){
		creatAccount.enterFullName(keyword);
	}
	@Step	
	public void enter_phone_number(String keyword) {
		creatAccount.enterPhoneNumber(keyword);
	}
	@Step
	public void enter_otp_code(String keyword) {
		creatAccount.enterOTPCode(keyword);
	}
	@Step
	public void enter_email(String keyword) {
		creatAccount.enterEmail(keyword);
	}
	@Step
	public void enter_password(String keyword) {
		creatAccount.enterPassWord(keyword);
	}
	@Step
	public void choose_gender() {
		creatAccount.chooseGender();
	}
	
	@Step 
	public void choose_day(int index) {
		creatAccount.chooseDay(index);
	}
	
	public void choose_month(int index) {
		creatAccount.chooseMonth(index);
	}
	
	public void choose_year(int index ) {
		creatAccount.chooseYear(index);
	}
	
	@Step
	public void receive_info_from_tiki() {
		creatAccount.receiveInfoFromTiki();
	}
	@Step
	public void creat_account() {
		creatAccount.creatAccount();
	}
	
	@Step
	public void should_see_warning_message_when_type_info_incorrect(String expectStr) {
		String actualStr=creatAccount.getWarnigMessage();
		assertThat(expectStr).isEqualTo(actualStr);
	}
	public void user_create_account_with(AccountInfo accountInfo){
		enter_full_name(accountInfo.getFullName());
		enter_phone_number(accountInfo.getPhoneNumber());
		enter_otp_code(accountInfo.getOtpCode());
		enter_email(accountInfo.getEmail());
		enter_password(accountInfo.getPassWord());
		choose_day(accountInfo.getDay());
		choose_month(accountInfo.getMonth());
		choose_year(accountInfo.getYear());
		choose_gender();
		receive_info_from_tiki();
		creat_account();
	}
	
}


