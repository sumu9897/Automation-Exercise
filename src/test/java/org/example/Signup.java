package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Signup extends DriverSetup{

    @Test
    public void SignUp() throws InterruptedException {
        browser.get("https://www.automationexercise.com/login");

        WebElement name = browser.findElement(By.xpath("(//input[@placeholder='Name'])[1]"));
        name.sendKeys("Mohammad Sumon");
        Thread.sleep(500);

        WebElement email = browser.findElement(By.xpath("(//input[@data-qa='signup-email'])[1]"));
        email.sendKeys("mohammad.sumon.aiub@gmail.com");
        Thread.sleep(1000);

        WebElement register = browser.findElement(By.xpath("(//button[normalize-space()='Signup'])[1]"));
        register.click();
        Thread.sleep(1000);

        WebElement title = browser.findElement(By.id("id_gender1"));
        title.click();
        Thread.sleep(1000);

        WebElement password = browser.findElement(By.id("password"));
        password.sendKeys("Password@121");
        Thread.sleep(1000);

        WebElement dayDropdown = browser.findElement(By.id("days"));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByVisibleText("25");

        WebElement monthDropdown = browser.findElement(By.id("months"));
        Select selectMonth = new Select(monthDropdown);
        selectMonth.selectByVisibleText("October");

        WebElement yearDropdown = browser.findElement(By.id("years"));
        Select selectYear = new Select(yearDropdown);
        selectYear.selectByVisibleText("1999");


        Thread.sleep(2000);
    }
}
