package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class WebsiteNavigation {
    public static void main(String[] args) {

        //Opening webpage and clicking image
        WebDriver obj = new ChromeDriver();

        //Webdriver for Selenium Server
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:portno/wd/hub"),
        //                new DesiredCapabilities.chrome());


        //Webdriver for specific platform
        //WebDriver driver = new RemoteWebDriver(new URL("http://localhost:portno/wd/hub"),
        //                new DesiredCapabilities(browser,version,platform));


        obj.get("https://www.google.com");

        WebElement input = obj.findElement(By.id("lst-ib"));
        input.sendKeys("Selenium");
        input.submit();

        //wait time
        //obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //explicit wait...faster!!
        WebDriverWait wait = new WebDriverWait(obj,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

        WebElement imagesLink = obj.findElements(By.linkText("Images")).get(0);
        imagesLink.click();
        WebElement image = obj.findElements(By.id("i48MSmX01sE18M:")).get(0);
        image.click();
    }
}
