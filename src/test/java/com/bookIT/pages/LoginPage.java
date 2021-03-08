package com.bookIT.pages;

import com.bookIT.utilities.BrowserUtils;
import com.bookIT.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class LoginPage {

    @FindBy(name = "email")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);
    }

    public void loginAsUsernameStudentElene() {
        username.sendKeys(ConfigurationReader.getProperty("usernameStudentElene"));
        password.sendKeys(ConfigurationReader.getProperty("passwordStudentElene"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);

    }

    public void loginAsUsernameStudentNonna() {
        username.sendKeys(ConfigurationReader.getProperty("usernameStudentNonna"));
        password.sendKeys(ConfigurationReader.getProperty("passwordStudentNonna"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);

    }

    public void loginAsUsernameTeamLead() {
        username.sendKeys(ConfigurationReader.getProperty("usernameTeamLead"));
        password.sendKeys(ConfigurationReader.getProperty("passwordTeamLead"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);

    }

    public void loginAsUsernameTeacher() {
        username.sendKeys(ConfigurationReader.getProperty("usernameTeacher"));
        password.sendKeys(ConfigurationReader.getProperty("passwordTeacher"), Keys.ENTER);
        BrowserUtils.waitForPageToLoad(10);

    }


}
