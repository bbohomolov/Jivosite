package Jivosite.steps;

import Jivosite.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {
    private String VALID_PASSWORD = "Some123";
    private String VALID_EMAIL = "test@test.com";
    private String URL = "www.test.com";
    private String NAME = "Bohdan";

    @Steps
    EndUserSteps endUser;

    @Given("the user is on Register page")
    public void givenTheUserIsOnRegisterPage() {endUser.open_register_page();}

    @When("press submit button")
    public void pressSubmitButton() {endUser.submit_register();}

    @When("user enter valid password")
    public void userEnterValidPassword() {
        endUser.enter_password(VALID_PASSWORD);
        endUser.errors_are_not_shown();
    }

    @When("user enter valid email")
    public void userEnterValidEmail() {
        endUser.enter_email(VALID_EMAIL);
        endUser.errors_are_not_shown();
    }

    @Then("'$message' text is shown near password field")
    public  void messageTextIsShownNearPasswordField(String message) {
        endUser.check_error_message_for_password_field(message);
    }

    @Then("'$header' page is shown")
    public void pageIsShown(String header) {
        endUser.check_header_page(header);
    }

    @When("user enter first name")
    public void userEnterFirstName() {
        endUser.enter_name(NAME);
        endUser.errors_are_not_shown();
    }

    @When("user enter url")
    public void userEnterURL() {
        endUser.enter_site(URL);
        endUser.errors_are_not_shown();
    }
}
