package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.Global_Vars;

public class ContactUs_PO extends Base_PO {
    private @FindBy(name = "first_name")
    WebElement firstname_TextField;

    private @FindBy(name = "last_name")
    WebElement lastname_TextField;

    private @FindBy(name = "email")
    WebElement email_TextField;

    private @FindBy(name = "message")
    WebElement message_TextField;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit_Button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission_Message_Text;


    public ContactUs_PO() {
        super();
    }



    public void navigateTo_WebDriverUniversity_ContactUs_Page(){
        navigateToURL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }

    public void setUnique_FirstName() {
        sendKeys(firstname_TextField, "AutoFN" + generateRandomNumber(5));
    }

    public void setUnique_LastName() {
        sendKeys(lastname_TextField, generateRandomNumber(5));
    }

    public void setUnique_Email() {
        sendKeys(email_TextField, "AutoEmail" + generateRandomNumber(10) + "@gmail.com");
    }

    public void setUnique_Comment() {
        sendKeys(message_TextField, "Hello World" + generateRandomString(20));
    }

    public void setSpecific_FirstName(String firstName) {
        sendKeys(firstname_TextField, firstName);
    }

    public void setSpecific_LastName(String lastName) {
        sendKeys(lastname_TextField, lastName);
    }

    public void setSpecific_Email(String email) {
        sendKeys(email_TextField, email);
    }

    public void setSpecific_Comment(String comment) {
        sendKeys(message_TextField, comment);
    }

    public void clickOn_Submit_Button() {
        waitForWebElementAndClick(submit_Button);
    }

    public void validate_Successful_SubmissionMessage_Text() {
        waitForWebElementAndClick(successfulSubmission_Message_Text);
        Assert.assertEquals(successfulSubmission_Message_Text.getText(),"Thank You for your Message!");
    }


}
