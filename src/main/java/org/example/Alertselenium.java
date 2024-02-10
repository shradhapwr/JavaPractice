package org.example;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertselenium {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mobikode\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a webpage with an alert
        driver.get("https://www.example.com");

        // Locate the element that triggers the alert
        driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert and print it
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Accept the alert (click on the OK button)
        alert.accept();

        // Close the browser
        driver.quit();
    }

}
