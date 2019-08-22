package com.chrome.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.chrome.models.AccountLogin;
import com.chrome.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	LoginPage onLoginPage;
	
	@Step
	public void user_enter_email_or_phone(String keyword) {
		onLoginPage.enterEmailOrPphone(keyword);
	}
	
	@Step
	public void user_enter_pass_word(String keyword) {
		onLoginPage.enterPaswword(keyword);
	}
	
	@Step
	public void user_click_login_button() {
		onLoginPage.clichLoginButton();
	}
	
	@Step
	public void should_see_warning_error_message_content(String expectStr) {
		String actualStr = onLoginPage.getWarningMgs();
		assertThat(expectStr).isEqualTo(actualStr);
	}
	
	@Step
	public void user_enter_info_login(AccountLogin accountInfo) {
		user_enter_email_or_phone(accountInfo.getEMAILORPHONE());
		user_enter_pass_word(accountInfo.getPASSWORD());
		user_click_login_button();
	}


	
	
	
}
