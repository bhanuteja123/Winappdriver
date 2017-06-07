package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.Skype_features_method;

/**
 * Created by bhanu_000 on 02-06-2017.
 */
public class Skype_features extends Skype_features_method {
    @When("^User click on the echo/Sound test$")
    public void userClickOnTheEchoSoundTest() throws Throwable {
        echo();
    }

    @Then("^vefify the echo page is opened$")
    public void vefifyTheEchoPageIsOpened() throws Throwable {
        get_text("name","Echo / Sound Test Service .");
    }

    @When("^User press the call button$")
    public void userPressTheCallButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^verify the$")
    public void verifyThe() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^User ends the call$")
    public void userEndsTheCall() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify if the echo page got opened$")
    public void verifyIfTheEchoPageGotOpened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
