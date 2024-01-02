package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Signup extends DriverSetup{

    @Test
    public void SignUp() throws InterruptedException {
        browser.get("https://www.automationexercise.com/login");

        WebElement name = browser.findElement(By.xpath("(//input[@placeholder='Name'])[1]"));
        name.sendKeys("Mohammad Sumon");
        Thread.sleep(1000);

        WebElement email = browser.findElement(By.xpath("(//input[@data-qa='signup-email'])[1]"));
        email.sendKeys("mohammad.sumon.aiub@gmail.com");
        Thread.sleep(1000);

        WebElement register = browser.findElement(By.xpath("(//button[normalize-space()='Signup'])[1]"));
        register.click();
        Thread.sleep(2000);
    }
}
