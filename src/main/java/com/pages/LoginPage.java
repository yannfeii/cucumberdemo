package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;
    private By userName = By.id("name");
    private By passWord = By.id("password");
    private By loginBtn = By.id("login");

    private By logoutBtn = By.id("logout");

    public LoginPage(WebDriver webDriver) {
        this.driver = webDriver;

        if(!driver.getTitle().equals("TestProject Demo")){
            throw new IllegalStateException("This is not login page. The current page is "
            +driver.getCurrentUrl());
        }
    }

    public void enterUserName(String userNameStr) {

        driver.findElement(userName).sendKeys(userNameStr);
    }

    public void enterPassWord(String passWordStr) {
        driver.findElement(passWord).sendKeys(passWordStr);
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }

    public void checkLogoutBtnIsDisplayed() {
        driver.findElement(logoutBtn).isDisplayed();
    }

    public void loginValidUser(String userNameStr,String passWordStr){
//        driver.findElement(userName).sendKeys(userNameStr);
//        driver.findElement(passWord).sendKeys(passWordStr);
//        driver.findElement(loginBtn).click();
        enterUserName(userNameStr);
        enterPassWord(passWordStr);
        clickLoginBtn();

    }

}
