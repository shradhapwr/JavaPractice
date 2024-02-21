package cucmberPractice;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class SampleStepDefinitions {
    WebDriver driver;

    @Given("I open the website")
    public void i_open_the_website() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("gaurav askdaskjlkdjasldjkasjkdjalsk");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Mobikode\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
//        throw new io.cucumber.java.PendingException();
    }
    @When("I perform some action")
    public void i_perform_some_action() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("whenasjkdjaklsjdlas");
        driver.findElement(By.linkText("Forgot password?")).click();
//        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the result")
    public void i_should_see_the_result() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("asdjkasjlkdasjlkj then");
        assertTrue(driver.findElement(By.id("did_submit")).isDisplayed());
        driver.quit();
//        throw new io.cucumber.java.PendingException();
    }




}
