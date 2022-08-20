package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {

    DialogContent dc=new DialogContent(GWD.getDriver());
    @Given("navigate to parabank")
    public void navigateToParabank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window().maximize();
    }

    @When("create a profile")
    public void createAProfile() {
     dc.findAndClick("registerBtn");
     dc.findAndSend("inputFirstname","Onur");
     dc.findAndSend("inputLastname","Incedayi");
     dc.findAndSend("inputStret","Levent");
     dc.findAndSend("inputCity","Istanbul");
     dc.findAndSend("inputState","Konstantine");
     dc.findAndSend("InputZipcode","Konstantine");
     dc.findAndSend("inputPhone","5397854152");
     dc.findAndSend("inputSsk","5252");
     dc.findAndSend("inputUsername","aasusrog5252");
     dc.findAndSend("inputPassword","525252");
     dc.findAndSend("inputRepassword","525252");
     dc.findAndClick("registerBtnOne");


    }

    @Then("success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMsg","success");
    }
}
