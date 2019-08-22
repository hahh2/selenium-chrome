package com.chrome.features.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.chrome.models.AccountInfo;
import com.chrome.steps.CreatAccountSteps;
import com.chrome.steps.HomeSteps;

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
public class WhenUserCreateAccount {

	@Managed
	WebDriver driver;
	
	@Steps
	HomeSteps homeSteps;
	
	@Steps
	CreatAccountSteps creatAccontSteps;
	
//	AccountInfo accountInfo = new AccountInfo("lu xu bu","0989898989","898989","luxubu@gmail.com","123456",5 , 1, 3);
	AccountInfo accountInfo = AccountInfo
			.named("lu xu bu")
			.withPhone("0989898989")
			.withOTPCode("898989")
			.withEmail("luxubu@gmail.com")
			.withPassWord("123456")
			.withDay(5)
			.withMonth(1)
			.withYear(5)
			.build(); 
	@Test
	@WithTag("register")
	public void register_new_account_with_incorrect_password(){
		String expectStr = "Mã xác thực không đúng hoặc đã hết hạn.!";
		homeSteps.user_click_on_create_account_link();
		creatAccontSteps.user_create_account_with(accountInfo);
		creatAccontSteps.should_see_warning_message_when_type_info_incorrect(expectStr);
	}
}
