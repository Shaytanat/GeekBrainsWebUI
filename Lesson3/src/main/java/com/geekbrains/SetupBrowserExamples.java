package com.geekbrains;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetupBrowserExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox")
                     .addArguments("--disable-notification")
                     .addArguments("user-agent=Googlebot/2.1 (http://www.google.com/bot.html)");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.com");
        Thread.sleep(2000);

        ((JavascriptExecutor)driver).executeScript("window.open(\"https://www.google.com\")");
        Thread.sleep(2000);
        driver.quit();


    }
}
