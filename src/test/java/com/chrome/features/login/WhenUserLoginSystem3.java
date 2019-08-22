package com.chrome.features.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.chrome.models.AccountLogin;
import com.chrome.steps.HomeSteps;
import com.chrome.steps.LoginSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;

@RunWith(SerenityRunner.class)
@WithTags({
	@WithTag("parallel")
}
)
public class WhenUserLoginSystem3 {
	
	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	LoginSteps loginSteps;
	
	AccountLogin accountLogin = new AccountLogin("hoanghaiha162@gmail.com", "hehehe");
	
	@Test
	public void user_login_system_with_info_incorrect() {
		String errMgs = "Thông tin đăng nhập không đúng";
		homeSteps.user_click_on_login_link();
		loginSteps.user_enter_info_login(accountLogin);
		loginSteps.should_see_warning_error_message_content(errMgs);
	}
}
