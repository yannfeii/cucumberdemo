package stepdefinitions.BackgroundDemo;

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

public class BackgroundDemoSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
    }
    @When("user clicks on login")
    public void user_clicks_on_login() {
    }
    @Then("logout link is displayed")
    public void logout_link_is_displayed() {
    }

    @Given("user is logged in")
    public void user_is_logged_in() {
    }
    @When("User clicks on welcome link")
    public void user_clicks_on_welcome_link() {
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
    }

    @When("User clicks on dashboard link")
    public void user_clicks_on_dashboard_link() {
    }

    @Then("click launch toolbar is displayed")
    public void click_launch_toolbar_is_displayed() {
    }
}
