package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class product extends DriverSetup{
    @Test
    public void AddProduct() throws InterruptedException {
        browser.get("https://www.automationexercise.com/products");

        WebElement cart = browser.findElement(By.xpath("(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[1]"));
        cart.click();
        Thread.sleep(500);

        WebElement continueShopping = browser.findElement(By.xpath("(//button[normalize-space()='Continue Shopping'])[1]"));
        continueShopping.click();
        Thread.sleep(500);

        WebElement cart1 = browser.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[3]"));
        cart1.click();
        Thread.sleep(500);

        WebElement continueShopping1 = browser.findElement(By.xpath("(//button[normalize-space()='Continue Shopping'])[1]"));
        continueShopping1.click();
        Thread.sleep(500);

    }

}
