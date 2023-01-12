import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
        glue = "stepDefinition",
        tags = "",
        plugin = { "json:reports/cucumber.json", "html:reports/cucumber-reports" },
        monochrome = true)

public class TestRunner {


}
