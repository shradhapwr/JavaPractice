package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ExceptionHandlingPractice {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mobikode\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        try {
            // Open Google's website and dance
            driver.get("https://www.google.com");

            // Find the search input field by its name attribute
            WebElement searchInput = driver.findElement(By.name("q123"));

            // Type a search query and eat
            searchInput.sendKeys("Exception handling in Selenium");

            // Submit the search by pressing Enter slay bitch
            searchInput.sendKeys(Keys.RETURN);
        } catch (org.openqa.selenium.NoSuchElementException e) {
            // Handle the exception if the search input field is not found
            System.out.println("Search input field not found. Please check your locator strategy.");
        } catch (Exception e) {
            // Handle other exceptions .
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Pause briefly to see the results before closing the browser window
            try {
                Thread.sleep(5000); // Wait for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Close the browser window regardless of success or failure
            driver.quit();
        }
    }
}
