package org.lesson7;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends StartPage{

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement addProduct;

    @Step("Добавление товара в корзину")
    public ProductsPage clickAddProduct() {
        addProduct.click();
        return this;
    }

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement cardButton;

    @Step("Переход в корзину")
    public CardPage clickCardButton() {
        cardButton.click();
        return new CardPage(driver);
    }
}
