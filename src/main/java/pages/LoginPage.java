package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By userName = By.xpath("//input[@name=\"username\"]");
    By password = By.xpath("//input[@type=\"password\"]");
    By loginButton = By.xpath("//button[@type=\"submit\"]");
    By forgetPasswordLink = By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]");


    public void fillUserName(String username){
        fillElement(userName,username);
    }
    public void fillPassword(String password){
        fillElement(this.password,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void clickOnForgetPasswordLink(){
        clickOnElement(forgetPasswordLink);
    }

}
