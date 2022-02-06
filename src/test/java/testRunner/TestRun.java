package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Search.feature",
        glue = "stepDefinations",
        plugin = {"pretty", "html:test-output.html"},
        tags = "@Smoke"
)
public class TestRun {

}