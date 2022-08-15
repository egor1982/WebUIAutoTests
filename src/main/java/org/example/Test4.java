package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(15000);

        WebElement webElement = driver.findElement(By.id("firstName"));
        webElement.sendKeys("Ivan");
        driver.findElement(By.id("lastName")).sendKeys("Petrov");
        driver.findElement(By.id("userEmail")).sendKeys("petrov@mail.ru");
        driver.findElement(By.cssSelector("#gender-radio-1+label")).click();
        driver.findElement(By.id("userNumber")).sendKeys("89999999999");
        driver.findElement((By.id("dateOfBirthInput"))).sendKeys(" ");
        driver.findElement((By.cssSelector(".react-datepicker__year-select>option:nth-child(103)"))).click();
        driver.findElement(By.cssSelector(".react-datepicker__month-select>option:nth-child(3)")).click();
        driver.findElement(By.cssSelector(".react-datepicker__day--010")).click();
        driver.findElement((By.id("subjectsInput"))).sendKeys("MR");
        driver.findElement(By.xpath("//input[@id=\"hobbies-checkbox-3\"]//following-sibling::label")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("Moscow");
        driver.findElement(By.id("submit")).submit();
        driver.quit();

    }
}
