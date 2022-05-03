package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By usernameField = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginButton = By.id("btnLogin");
    By forgotPasswordButton = By.xpath("//a[contains(text(),'Forgot your password?')]");


    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickLoginInButton() {
        clickOnElement(loginButton);
    }

    public void clickForgotPasswordButton() {
        clickOnElement(forgotPasswordButton);
    }

}
