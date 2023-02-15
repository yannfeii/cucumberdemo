package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/appfeatures/HooksDemo.feature"},
        glue = {"stepdefinitions/HooksDemoSteps"},
        monochrome = false
)
public class TestRunnerWithHooks {
}
