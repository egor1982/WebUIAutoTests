package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/*
 * Сценарий из Задания №1: "Совершение успешной покупки на сайте https://www.saucedemo.com/
 * Доступ: Логин ~ standard_user; пароль ~ secret_sauce
 * Данные для покупки: First name - User; Last user ~ Standart; Zip ~ 00000
 */

public class Test5 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //TestCase1: Authorization
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name"));
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        //TestCase2: Add product for cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        driver.findElement((By.id("add-to-cart-sauce-labs-backpack"))).click();
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        //TestCase3: Checkout: Your information
        driver.findElement(By.id("checkout"));
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name"));
        driver.findElement(By.id("first-name")).sendKeys("User");
        driver.findElement((By.id("last-name"))).sendKeys("Standart");
        driver.findElement((By.id("postal-code"))).sendKeys("00000");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish"));
        driver.findElement(By.id("finish")).click();
        //TestCase4: Logout this site
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("logout_sidebar_link"));
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(5000);  // Сan be removed
        driver.quit();

    }
}
