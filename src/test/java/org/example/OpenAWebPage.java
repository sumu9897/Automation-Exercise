package org.example;

import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup{

    @Test
    public  void OpenApage() throws InterruptedException {
        browser.get("https://www.automationexercise.com/");
        Thread.sleep(2000);

        System.out.println(browser.getTitle());
        System.out.println(browser.getCurrentUrl());
//        System.out.println(browser.getPageSource());
        System.out.println(browser.getWindowHandle());
        System.out.println(browser.getWindowHandles());
        System.out.println(browser.switchTo());
        System.out.println(browser.manage());
        System.out.println(browser.navigate());


    }
}
