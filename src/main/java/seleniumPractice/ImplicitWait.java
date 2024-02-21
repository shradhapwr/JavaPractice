package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ImplicitWait {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the sample website
        driver.get("https://www.example.com");

        // Implicit Wait - wait for up to 10 seconds before throwing NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);

        // Find an element using implicit wait
        WebElement elementImplicit = driver.findElement(By.id("someElementId"));

        // Explicit Wait - wait for up to 10 seconds for the element to be clickable
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elementExplicit = wait.until(ExpectedConditions.elementToBeClickable(By.id("someOtherElementId")));

        // Perform actions on the elements
        elementImplicit.click();
        elementExplicit.sendKeys("Hello, Selenium!");

        // Close the browser
        driver.quit();
    }
}
