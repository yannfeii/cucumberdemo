package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver = null;

    @Given("User is on Application Home Page")
    public void userApplicationHomePage(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "src/main/java/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mail.163.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    @When("Application Page Title is 163")
    public void applicationPageTitle(){
        String pageTitle = driver.getTitle();
        String expectedTitle = "163网易免费邮-你的专业电子邮局";
        Assert.assertEquals(expectedTitle,pageTitle);
    }

    @Then("User enters username and password")
    public void enter_UserNameAndPassWord(){
        driver.findElement(By.name("email")).sendKeys("");
        driver.findElement(By.name("password")).sendKeys("");
    }

    @And("User clicks on Login Button")
    public void clickLogInButton(){
        WebElement loginEle = driver.findElement(By.id("dologin"));
        //loginEle.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click;",loginEle);


    }

    @When("User navigate to user profile page")
    public void navigateToUserProfilePage(){
        String pageTitle = driver.getTitle();
        String expectedTitle = "";
        Assert.assertEquals(expectedTitle,pageTitle);
        driver.close();
    }


}
