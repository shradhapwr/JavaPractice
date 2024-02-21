package cucmberPractice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "cucumberPractice" // Package where your step definitions are located
//        tags = "@smoke", // Tags to include/exclude specific scenarios or features
//        plugin = {"pretty", "html:target/cucumber-reports"} // Report generation options
)
public class CucumberTestRunner {
    // This class will be empty
    // Cucumber will automatically find and run your features and steps
}
