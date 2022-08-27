package org.lesson7;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.ByteArrayInputStream;

public class CustomLogger {

    public void beforeClick(WebElement element) {
        Allure.step("Кликаем по элементу " + element.getText());
    }

    public void beforeQuit(WebDriver driver) {

        Allure.addAttachment("Скриншот страницы: ",
                new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));

    }
}

