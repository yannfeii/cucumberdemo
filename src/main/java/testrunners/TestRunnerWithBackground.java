package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/appfeatures/BackgroundDemo.feature"},
        glue = {"stepdefinitions/BackgroundDemo"},
        monochrome = true,
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
                "json:target/JUnitReports/report.json",
                "html:target/HtmlReports/report.html"}
)
public class TestRunnerWithBackground {
}
