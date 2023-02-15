package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\d1211862\\Documents\\IdeaProjects\\cucumberdemo\\src\\main\\java\\appfeatures\\Login.feature"},
        glue = {"stepdefinitions"},
        dryRun = true,
        monochrome = true
)
public class LoginTestRunner {
}
