package com.orangehrmlive.demo_opensource.pages;

import com.orangehrmlive.demo_opensource.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By welcomeText = By.xpath("//*[@id='welcome']");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
