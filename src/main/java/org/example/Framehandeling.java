package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandeling {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with frames
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe");

        // Switch to the iframe using name or id attribute
        driver.switchTo().frame("iframeResult");

        // Perform actions inside the iframe
        WebElement iframeBody = driver.findElement(By.tagName("body"));
        iframeBody.sendKeys("Hello, Selenium!");

        // Switch back to the default content
        driver.switchTo().defaultContent();

        // Perform actions outside the iframe
        WebElement outsideIframe = driver.findElement(By.id("textareaCode"));
        outsideIframe.clear();
        outsideIframe.sendKeys("Switched back to default content.");

        // Close the browser
        driver.quit();
    }
}
