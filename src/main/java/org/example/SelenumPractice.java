package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelenumPractice {
    //"C:\\Users\\Mobikode\\OneDrive\\Desktop\\selenium_chrome_driver\\chrome.exe"
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mobikode\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Mobikode\\OneDrive\\Desktop\\edgedriver_win64\\msedgedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();
        googleSearch(driver);
       // sauceLoginDemo(driver);
//        driver = new EdgeDriver();
        // Navigate to the Facebook login page

//        sauceLoginDemo(driver);


        // Wait for a few seconds (you might want to use more sophisticated waiting strategies)
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        // Close the browser
//        driver.quit();
    }

    private static void facebookLoginTest(WebDriver driver) {
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("Shraddha");
        driver.findElement(By.id("pass")).sendKeys("1234@ggh");
        driver.findElement(By.name("login")).click();
    }

    private static void sauceLoginDemo(WebDriver driver) {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
    }

    private static void googleSearch(WebDriver driver) {
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys("dogs");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea")).sendKeys(Keys.RETURN);

    }
}



