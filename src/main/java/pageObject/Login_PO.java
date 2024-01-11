package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Global_Vars;

public class Login_PO extends Base_PO {
    private @FindBy(id = "text")
    WebElement username_TextField;

    private @FindBy(id = "password")
    WebElement password_TextField;

    private @FindBy(id = "login-button")
    WebElement login_Button;
    public Login_PO() {
        super();
    }

    public void navigateTo_WebDriverUniversity_Login_Page(){
        navigateToURL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Login-Portal/index.html");
    }

    public void setUsername(String username){
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }

    public void clickOnLoginButton(){
        waitForWebElementAndClick(login_Button);
    }

    public void validateSuccessfulLoginMessage() {
        waitForAlertAndValidateText("validation succeeded");
    }

    public void validateUnSuccessfulLoginMessage() {
        waitForAlertAndValidateText("validation failed");
    }

}
