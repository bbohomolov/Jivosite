package Jivosite.steps.serenity;

import Jivosite.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EndUserSteps {

    RegistrationPage registrationPage;

    @Step
    public void enter_email(String email) {
        registrationPage.enter_to_email_input(email);
    }

    @Step
    public void enter_password(String password) {
        registrationPage.enter_to_password_input(password);
    }

    @Step
    public void open_register_page() {
        registrationPage.open();
    }

    @Step
    public void submit_register() {
        registrationPage.click_submit_button();
    }

    @Step
    public void check_error_message_for_password_field(String message) {
        assertThat(registrationPage.get_error_message_for_password(), is(message));
    }

    @Step
    public void check_header_page(String header) {
        registrationPage.waitForTextToAppear(header);
        assertThat(registrationPage.get_page_header(), is(header));
    }

    @Step
    public void enter_name(String name) {
        registrationPage.enter_to_name_input(name);
    }

    @Step
    public void enter_site(String site) {
        registrationPage.enter_to_site_url_input(site);
    }

    @Step
    public void errors_are_not_shown() {
        assertThat("Some errors were shown when they shouldn't be.", registrationPage.errors_is_visible(), is(Boolean.FALSE));
    }
}