package com.geekbrains;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SeleniumDevStart {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.quit();

        WebDriverManager.operadriver().setup();
        WebDriver operaDriver = new OperaDriver();
        operaDriver.get("https://www.ya.ru/");
        Thread.sleep(5000);
        driver.quit();

    }
}
