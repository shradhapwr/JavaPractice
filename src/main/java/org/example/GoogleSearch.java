package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable. You can download it from https://sites.google.com/chromium.org/driver/
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mobikode\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");

        // Initialize the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Google search page
        driver.get("https://www.google.com");

        // Locate the search bar using its name attribute
        WebElement searchBox = driver.findElement(By.name("q"));

        // Type "Yoga" into the search bar
        searchBox.sendKeys("Yoga");

        // Press Enter key to perform the search
        searchBox.sendKeys(Keys.RETURN);

        // Wait for some time (you may need to add explicit waits for real-world scenarios)
        try {
            Thread.sleep(10000); // Wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }
}
