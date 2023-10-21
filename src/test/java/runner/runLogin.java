package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = "stepDefinition",
        plugin = "html:target/HTML_report.html",
        tags = "@Positive"
//        tags = "@Negative"
)
public class runLogin {
}