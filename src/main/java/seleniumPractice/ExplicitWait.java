package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the sample website
        driver.get("https://www.example.com");

        // Explicit Wait - wait for up to 10 seconds for the element to be present
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Example using ExpectedConditions.presenceOfElementLocated
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("someElementId")));

        // Perform actions on the element
        element.click();

        // Close the browser
        driver.quit();
    }
}
