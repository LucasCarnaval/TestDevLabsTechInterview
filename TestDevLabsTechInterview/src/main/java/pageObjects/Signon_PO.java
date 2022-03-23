package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signon_PO extends Base_PO {

    private @FindBy(id = "sView1:r1:0:email::content")
    WebElement email_TextField;

    private @FindBy(id = "sView1:r1:0:password::content")
    WebElement password_TextField;

    private @FindBy(id = "sView1:r1:0:retypePassword::content")
    WebElement retypePassword_TextField;

    private @FindBy(id = "sView1:r1:0:country::content")
    WebElement coutry_DropDown;

    private @FindBy(id = "sView1:r1:0:firstName::content")
    WebElement name_TextField;

    private @FindBy(id="sView1:r1:0:lastName::content")
    WebElement lastName_TextField;

    private @FindBy(id="sView1:r1:0:jobTitle::content")
    WebElement jobTitle_TextField;

    private @FindBy(id="sView1:r1:0:workPhone::content")
    WebElement workPhone_TextField;

    private @FindBy(id="sView1:r1:0:companyName::content")
    WebElement company_TextField;

    private @FindBy(id="sView1:r1:0:address1::content")
    WebElement address_TextField;

    private @FindBy(id="sView1:r1:0:city::content")
    WebElement city_TextField;

    private @FindBy(id = "sView1:r1:0:state::content")
    WebElement state_DropDown;

    private @FindBy(id = "sView1:r1:0:postalCode::content")
    WebElement postalCode_TextFiel;

    private @FindBy(id = "sView1:r1:0:b1")
    WebElement signon_Button;






    public void fillForm(){
        String password = "AutoPassword" + generateRandomString(10);
        String email = "AutoEmail" + generateRandomString(10) + "@gmail.com";
        String name = "AutoName" + generateRandomString(5);
        String lastName = "AutoLastName" + generateRandomString(5);
        String jobTitle = "AutoJobTitle" + generateRandomString(5);
        String workPhone = generateRandomNumber(9);
        String company = "AutoCompany" + generateRandomString(10);
        String address = "AutoAddress" + generateRandomString(20);
        String city = "AutoCity" + generateRandomString(20);
        String postalCode = generateRandomNumber(8);


        sendKeys(email_TextField, email);
        sendKeys(password_TextField, password);
        sendKeys(retypePassword_TextField, password);
        selectDropItem(coutry_DropDown, 2);
        sendKeys(name_TextField, name);
        sendKeys(lastName_TextField, lastName);
        sendKeys(jobTitle_TextField, jobTitle);
        sendKeys(workPhone_TextField, workPhone);
        sendKeys(company_TextField, company);
        sendKeys(address_TextField, address);
        sendKeys(city_TextField, city);
        selectDropItem(state_DropDown, 3);
        sendKeys(postalCode_TextFiel, postalCode);

    }

    public void clickOnSignonButton(){
        clickOnElement(signon_Button);
    }



}
