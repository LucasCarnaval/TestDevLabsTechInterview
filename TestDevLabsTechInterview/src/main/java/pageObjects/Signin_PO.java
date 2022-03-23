package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signin_PO extends Base_PO {

    private @FindBy(id = "sso_username")
    WebElement username_TextField;

    private @FindBy(id = "ssopassword")
    WebElement password_TextField;

    private @FindBy(id = "signin_button")
    WebElement signin_Button;

    private @FindBy(xpath = "/html/body/div/div[3]/div[2]/div[1]/span/a")
    WebElement signon_Button;


    public Signin_PO(){
        super();
    }

    public void navigateToOracleSigninPage(){
        nagigateToURL("https://profile.oracle.com/");
    }

    public void setEmail(String username){
        sendKeys(username_TextField, username);
    }

    public void setPassword(String password){
        sendKeys(password_TextField, password);
    }

    public void clickOnSigninButton(){
        clickOnElement(signin_Button);
    }

    public void clickOnSignonButton(){
        clickOnElement(signon_Button);
    }

    public void validateErrorMessage(){
        switchToATab(0);
        //it is necessary to change the validated text if your oracle website is in another language
        validateText(By.xpath("//*[@id='errormsg']/div"), "Nome de utilizador e/ou senha inválidos.");
    }

}
