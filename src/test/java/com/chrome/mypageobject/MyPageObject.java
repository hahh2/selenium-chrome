package com.chrome.mypageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MyPageObject extends PageObject{

	public void chooseTimes(WebElementFacade elememt, int index){
		Robot robot ;
		try {
			robot = new Robot();
			robot.setAutoDelay(200);
			elememt.click();
			for(int i = 1; i <= index; i++) {
				robot.keyPress(KeyEvent.VK_DOWN);
			}
			robot.keyPress(KeyEvent.VK_ENTER);
			
		}catch(AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void highlight(WebElementFacade webElement) {
		evaluateJavascript("arguments[0].setAttribute('style', arguments[1]);", webElement,"color: red; border: 2px solid red;");

	}
	
	public void scrollViewElement(WebElementFacade webElement) {
		evaluateJavascript("arguments[0].scrollIntoView(true);", webElement);
	}
}
	