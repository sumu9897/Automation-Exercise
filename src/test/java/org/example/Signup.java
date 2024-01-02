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
        password.sendKeys("Pass121jibon");
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

        WebElement newsletter = browser.findElement(By.id("newsletter"));
        newsletter.click();
        Thread.sleep(300);

        WebElement checkbox = browser.findElement(By.id("optin"));
        checkbox.click();
        Thread.sleep(300);

        WebElement firstName = browser.findElement(By.id("first_name"));
        firstName.sendKeys("Mohammad");
        Thread.sleep(300);

        WebElement lastName = browser.findElement(By.id("last_name"));
        lastName.sendKeys("Sumon");
        Thread.sleep(300);

        WebElement company = browser.findElement(By.id("company"));
        company.sendKeys("MS");
        Thread.sleep(300);

        WebElement address = browser.findElement(By.xpath("(//input[@id='address1'])[1]"));
        address.sendKeys("Gulshan, Dhaka");
        Thread.sleep(250);

        WebElement address2 = browser.findElement(By.xpath("//input[@id='address2']"));
        address2.sendKeys("Dhaka");
        Thread.sleep(500);

        WebElement country1 = browser.findElement(By.id("country"));
        Select country = new Select(country1);
        country.selectByVisibleText("United States");

        WebElement state = browser.findElement(By.xpath("(//input[@id='state'])[1]"));
        state.sendKeys("New York");

        WebElement city = browser.findElement(By.xpath("(//input[@id='city'])[1]"));
        city.sendKeys("New York");

        WebElement zipcode = browser.findElement(By.id("zipcode"));
        zipcode.sendKeys("1212");
        Thread.sleep(300);

        WebElement mobile = browser.findElement(By.id("mobile_number"));
        mobile.sendKeys("0153529480");
        Thread.sleep(300);

        WebElement create = browser.findElement(By.xpath("(//button[normalize-space()='Create Account'])[1]"));
        create.click();
        Thread.sleep(1000);






        Thread.sleep(2000);
    }
}
