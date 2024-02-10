package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon1 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable. You can download it from https://sites.google.com/chromium.org/driver/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mobikode\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Amazon login page
        driver.get("https://www.amazon.com");

        // Locate the login link and click on it
        WebElement loginLink = driver.findElement(By.id("nav-link-accountList"));
        loginLink.click();

        // Locate the email field and enter your email
        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("your_email@example.com");

        // Locate the "Continue" button and click on it
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Locate the password field and enter your password
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("your_password");

        // Locate the "Sign-In" button and click on it
        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();

        // Close the browser
        driver.quit();
    }
}
