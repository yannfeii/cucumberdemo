package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPFPage {

    WebDriver driver;

    @FindBy(id = "name")
    @CacheLookup
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(id = "login")
    WebElement loginBtn;

    @FindBy(id = "logout")
    WebElement logoutBtn;

    @FindBy( partialLinkText = "raghav")
    List<WebElement> myLinks;

    public LoginPFPage(WebDriver webDriver){

        this.driver = webDriver;
        PageFactory.initElements(driver,this);
    }


    public void enterUserName(String userNameStr) {

        userName.sendKeys(userNameStr);
    }

    public void enterPassWord(String passWordStr){

        passWord.sendKeys(passWordStr);
    }

    public void clickLoginBtn() {
       loginBtn.click();
    }

    public void checkLogoutBtnIsDisplayed() {
        logoutBtn.isDisplayed();
    }

}
