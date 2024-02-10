package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TravelPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        WebElement element = driver.findElement(By.id("Dropdown"));
        Select select = new Select(element);
        select.selectByVisibleText("option2");
        driver.quit();
        

    }
}
