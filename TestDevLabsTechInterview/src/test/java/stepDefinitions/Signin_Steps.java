package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Signin_PO;

public class Signin_Steps {

    private Signin_PO signin_po;

    public Signin_Steps(Signin_PO signin_po){
        this.signin_po = signin_po;
    }

    @Given("User has opened Oracle Profile page")
    public void user_has_opened_oracle_profile_page() {
        signin_po.navigateToOracleSigninPage();
    }

    @When("User inputs {} as the email")
    public void user_inputs_as_the_email(String email) {
        signin_po.setEmail(email);
    }

    @And("User inputs {} as the password")
    public void user_inputs_as_the_password(String password) {
        signin_po.setPassword(password);
    }
    @And("User presses the sing in button")
    public void user_presses_the_sing_in_button() {
        signin_po.clickOnSigninButton();
    }
    @Then("User sees invalid credentials message")
    public void user_sees_invalid_credentials_message() {
        signin_po.validateErrorMessage();
    }


}
