package org.example;

import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetup{

    @Test
    public  void OpenApage() throws InterruptedException {
        browser.get("https://www.automationexercise.com/");
        Thread.sleep(2000);

        System.out.println(browser.getTitle());

    }
}
