package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TablesUsingXpath {
    public static void main(String[] args) {

        //Checking some Dyanamic features
        WebDriver driver = new ChromeDriver();
        Path sampleFile = Paths.get("Tables_Xpath.html");
        driver.get(sampleFile.toUri().toString());

        //WebElement outerTable = driver.findElement(By.tagName("table"));
        //WebElement innerTable = outerTable.findElement(By.tagName("table"));
        //WebElement row = innerTable.findElements(By.tagName("td")).get(1);
        WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
        System.out.println(row.getText());
    }
}
