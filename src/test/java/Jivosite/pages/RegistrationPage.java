package Jivosite.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://admin.jivosite.com/autoreg")
public class RegistrationPage extends PageObject {

    @FindBy(id="email")
    private WebElementFacade emailInputField;

    @FindBy(id="password")
    private WebElementFacade passwordInputField;

    @FindBy(xpath = "//div[@class='form-group center']/input")
    private WebElementFacade submitButton;

    @FindBy(xpath = "//div[@class='form-group password']/div[@class='error-wrap']/span")
    private WebElementFacade passwordErrorText;

    @FindBy(xpath = "//h1")
    private WebElementFacade pageHeader;

    @FindBy(id = "name")
    private WebElementFacade nameInputField;

    @FindBy(id = "site_url")
    private WebElementFacade siteURLInputField;

    @FindBy(className = "error-wrap")
    private WebElementFacade errorMessage;

    public void enter_to_email_input(String email) {emailInputField.type(email);}

    public void enter_to_password_input(String password) {passwordInputField.type(password);}

    public void click_submit_button() {submitButton.click();}

    public String get_error_message_for_password() {return  passwordErrorText.getText();}

    public String get_page_header() {return pageHeader.getText(); }

    public void enter_to_name_input(String name) {nameInputField.type(name);}

    public void enter_to_site_url_input(String site) {siteURLInputField.type(site);}

    public boolean error_is_visible() {
        return errorMessage.isCurrentlyVisible();
    }
}
