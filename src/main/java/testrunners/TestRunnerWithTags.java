package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/appfeatures/Tags.feature"},
        glue = {"stepdefinitions"},
        //tags = "@SmokeTest"
        //tags = "@SmokeTest or @RegressionTest"
        //tags = "@SmokeTest and @RegressionTest"
        //tags = "@SmokeTest or @RegressionTest and @important"//sample 1 and sample 3
        tags = "(@SmokeTest or @RegressionTest) and @important"
        //tags = "@SmokeTest and not @RegressionTest"
)
public class TestRunnerWithTags {
}
