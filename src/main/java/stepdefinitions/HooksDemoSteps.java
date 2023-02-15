package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HooksDemoSteps {

    WebDriver driver = null;

    //@Before("@SmokeTest")
    @Before(value = "@SmokeTest", order = 1)
    public void browserSetUp() {
        System.out.println("I am inside browserSetUp");

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "src/main/java/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }

    @Before(order = 0)
    public void beforeSetupOrder() {
        System.out.println("I am inside beforeSetupOrder");
    }

    @After(order = 1)
    public void teardown() {
        System.out.println("I am inside teardown");
        driver.close();
        driver.quit();
    }

    @After(order = 0)
    public void afterTeardownOrder() {
        System.out.println("I am inside afterTeardownOrder");
    }

    @BeforeStep
    public void beforeSteps() {
        System.out.println("I am inside beforeSteps");
    }

    @AfterStep
    public void afterSteps() {
        System.out.println("I am inside afterSteps");
    }

    @Given("^user is on login page$")
    public void user_is_on_login_page() {

    }

    @When("^User enters username and password$")
    public void user_enters_username_and_password() {

    }

    @And("^User clicks on Login$")
    public void user_clicks_on_Login() {

    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() {
    }
}
