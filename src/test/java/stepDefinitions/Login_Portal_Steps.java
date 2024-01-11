package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Base_PO;
import pageObject.Login_PO;

public class Login_Portal_Steps extends Base_PO {
    private WebDriver driver = getDriver();
    private Login_PO login_po;
    public Login_Portal_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }
    @Given("I access the webdriver university login page")
    public void i_access_the_webdriver_university_login_page() {
        login_po.navigateTo_WebDriverUniversity_Login_Page();
    }
    @When("I enter a username {string}")
    public void i_enter_a_username(String username) {
        login_po.setUsername(username);
    }
    @And("I enter a password {}")
    public void i_enter_a_password(String password) {
        login_po.setPassword(password);
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        login_po.clickOnLoginButton();
    }
    @Then("I should be presented with a message {string}")
    public void i_should_be_presented_with_a_message(String loginValidationMessage) {
        waitForAlertAndValidateText(loginValidationMessage);
    }

}
