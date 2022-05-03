package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class ForgottenPasswordPage extends Utility {

    By forgotPasswordText = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public String getForgotPasswordText() {
        return getTextFromElement(forgotPasswordText);
    }
}
