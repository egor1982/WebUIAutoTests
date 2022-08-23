package org.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StartPage {

    WebDriver driver;
    WebDriverWait driverWait;
    Actions actions;

    public StartPage(WebDriver driver) {
        this.driver = driver;
        driverWait = new WebDriverWait(driver, Duration.ZERO.toSecondsPart());
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }
}
