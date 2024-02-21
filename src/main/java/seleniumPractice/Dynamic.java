package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the example website (replace with your website URL)
        driver.get("https://example.com");

        // Example 1: Handling dynamic elements using XPath with contains()
        WebElement dynamicElementXPath = driver.findElement(By.xpath("//input[contains(@id, 'dynamicPart')]"));
        System.out.println("Element found using XPath with contains(): " + dynamicElementXPath.getAttribute("id"));

        // Example 2: Handling dynamic elements using CSS Selector with *=
        WebElement dynamicElementCssSelector = driver.findElement(By.cssSelector("input[id*='dynamicPart']"));
        System.out.println("Element found using CSS Selector with *=: " + dynamicElementCssSelector.getAttribute("id"));

        // Example 3: Waiting for an element to be present using WebDriverWait
       // WebDriverWait wait = new WebDriverWait(driver);
        //WebElement waitForElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicElementId")));
        //System.out.println("Element found after waiting: " + waitForElement.getAttribute("id"));

        // Example 4: Retry mechanism for locating an element
        int attempts = 0;
        while (attempts < 3) {
            try {
                WebElement retryElement = driver.findElement(By.id("dynamicElementId"));
                System.out.println("Element found with retry mechanism: " + retryElement.getAttribute("id"));
                break;
            } catch (NoSuchElementException e) {
                // Retry logic
                attempts++;
                System.out.println("Retry attempt: " + attempts);
                try {
                    Thread.sleep(1000); // Wait for a second before retrying
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

        // Close the browser
        driver.quit();
    }
}

