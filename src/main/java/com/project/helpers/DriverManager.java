package com.project.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {

    WebDriver driver;
    private static DriverManager driverManager;

    private DriverManager() {
        // Making this singleton
    }

    public static DriverManager getDriverManagerInstance() {
        if (driverManager == null) {
            driverManager = new DriverManager();
        }

        return driverManager;
    }

    public void openWebDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "//Users//ruchia//Desktop//Work//softwares//chromedriver");
            driver = new ChromeDriver();
        }
    }

    public void closeWebDriver() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openUrl(String url) {
        driver.get(url);
    }

    public void maximizeWindow() {
        driver.manage().window().fullscreen();
    }

    public String getWindowTitle() {
        return driver.getTitle();
    }

    public WebElement findElement(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }

    public void switchToIframeElement(WebElement element) {
        driver.switchTo().frame(element);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public void javascriptClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }
}
