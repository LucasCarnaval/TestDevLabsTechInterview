package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Signin_PO;
import pageObjects.Signon_PO;

public class Signon_Steps {

    private Signon_PO signon_po;

    private Signin_PO signin_po;

    public Signon_Steps(Signon_PO signon_po, Signin_PO signin_po){
        this.signin_po = signin_po;
        this.signon_po = signon_po;
    }

    @When("User presses Create Account button")
    public void user_presses_create_account_button() {
        signin_po.clickOnSignonButton();
        signon_po.switchToATab(1);
    }

    @And("User fills out Create Account form")
    public void user_fills_out_create_account_form() {
        signon_po.fillForm();
    }
    @And("User presses Sign Up button")
    public void user_presses_sign_up_button() {
        signon_po.clickOnSignonButton();
    }
    @Then("User is redirected to Check Your Email page")
    public void user_is_redirected_to_check_your_email_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
