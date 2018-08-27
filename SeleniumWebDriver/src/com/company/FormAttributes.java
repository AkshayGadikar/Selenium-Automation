package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FormAttributes {

    public static void main(String[] args) {

        //Checking some Dyanamic features

        WebDriver obj2 = new ChromeDriver();
        Path sampleFile = Paths.get("ButtonTestPage.html");
        obj2.get(sampleFile.toUri().toString());

        //RadioButtons
        //select particular radio buttion
        List<WebElement> radiobuttons = obj2.findElements(By.name("color"));
        radiobuttons.get(1).click();

        //red is already checked. Print the one which we select
        for (WebElement button: radiobuttons){
            if(button.isSelected()){
                System.out.println(button.getAttribute("value"));
            }

        }

        //CheckBox
        WebElement checkbox = obj2.findElement(By.id("box1"));
        checkbox.click();

        //Select  Form-List
        WebElement selectElement = obj2.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");


    }
}
