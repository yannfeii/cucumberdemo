package stepdefinitions;

import com.pages.LoginPFPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPFSteps {

    WebDriver driver = null;

    LoginPFPage loginPFPage;

    @Given("browser is open")
    public void browser_is_open(){

        System.out.println("Inside Step - browser is open");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "src/main/java/resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
    }

    @And("user is on login page")
    public void user_Is_On_LoginPage() {
        driver.navigate().to("https://mail.163.com/");
    }

    @When("^User enters (.*) and (.*)$")
    public void enter_User_Name_And_PassWord(String userName,String passWord) throws InterruptedException {

        loginPFPage = new LoginPFPage(driver);
        loginPFPage.enterUserName(userName);
        loginPFPage.enterPassWord(passWord);

        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void user_Clicks_On_Login(){
        loginPFPage.clickLoginBtn();
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() throws InterruptedException {

        loginPFPage.checkLogoutBtnIsDisplayed();

        Thread.sleep(2000);
        driver.close();
        driver.quit();

    }

}
