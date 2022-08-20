package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent (WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy (linkText = "Register")
    private WebElement registerBtn;

    @FindBy (id = "customer.firstName" )
    private WebElement inputFirstname;

    @FindBy(id = "customer.lastName")
    private WebElement inputLastname;

    @FindBy (id="customer.address.street")
    private WebElement inputStret;

    @FindBy(id="customer.address.city")
    private WebElement inputCity;

    @FindBy(id="customer.address.state")
    private WebElement inputState;

    @FindBy(id="customer.address.zipCode")
    private WebElement InputZipcode;

    @FindBy (id="customer.phoneNumber")
    private WebElement inputPhone;

    @FindBy(id = "customer.ssn")
    private WebElement inputSsk;

    @FindBy(id="customer.username")
    private WebElement inputUsername;

    @FindBy(id="customer.password")
    private WebElement inputPassword;

    @FindBy (id = "repeatedPassword")
    private WebElement inputRepassword;

    @FindBy (css = "[value='Register']")
    private WebElement registerBtnOne;

    @FindBy(css = "[id='rightPanel']>p")
    private WebElement successMsg;

    @FindBy(name = "username")
    private WebElement username;

    @FindBy (name = "password")
    private WebElement password;

    @FindBy (css = "[value='Log In']")
    private WebElement loginBtn;

    @FindBy (css = "h1[class=\"title\"]")
    private WebElement loginMsg;

    @FindBy (linkText = "Bill Pay")
    private WebElement billPayBtn;

    @FindBy (name = "payee.name")
    private WebElement payeeName;




    WebElement myElement;
    public void findAndSend(String strElement,String value){

        switch (strElement){
            case "inputFirstname":myElement=inputFirstname;break;
            case "inputLastname":myElement=inputLastname;break;
            case "inputStret":myElement=inputStret;break;
            case "inputCity":myElement=inputCity;break;
            case "inputState":myElement=inputState;break;
            case "InputZipcode":myElement=InputZipcode;break;
            case "inputPhone":myElement=inputPhone;break;
            case "inputSsk":myElement=inputSsk;break;
            case "inputUsername":myElement=inputUsername;break;
            case "inputPassword":myElement=inputPassword;break;
            case "inputRepassword":myElement=inputRepassword;break;
            case "username":myElement=username;break;
            case "password":myElement=password;break;



        }
        sendKeysFunction(myElement,value);
    }
    public void findAndClick(String strElement){

        switch (strElement){
            case "registerBtn":myElement=registerBtn;break;
            case "registerBtnOne":myElement=registerBtnOne;break;
            case "loginBtn":myElement=loginBtn;break;
            case "billPayBtn":myElement=billPayBtn;break;

        }
        clickFunction(myElement);
    }
    public void findAndContainsText(String strelement, String text){
        switch (strelement){
            case "successMsg":myElement=successMsg;break;
            case "loginMsg" : myElement = loginMsg; break;


        }
        verifyContainsText(myElement,text);

    }

}
