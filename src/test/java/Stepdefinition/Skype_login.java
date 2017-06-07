package Stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.Skype_method;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by bhanu_000 on 01-06-2017.
 */
public class Skype_login extends Skype_method {
    @Given("^User Opens the Skype app$")
    public void userOpensTheSkypeApp() throws Throwable {
        open();
    }

    @Then("^Verify the title of the page$")
    public void verifyTheTitleOfThePage() throws Throwable {
        WindowTitle();
        Thread.sleep(2000);
    }

    @When("^User give a valid username \"([^\"]*)\"$")
    public void userGiveAVaildUsername(String arg0) throws Throwable {
        username(arg0);
    }

    @Then("^Verify the if the username got passed$")
    public void verifyTheIfTheUsernameGotPassed() throws Throwable {
        user_verfiy();
    }

    @When("^User give a valid  password \"([^\"]*)\"$")
    public void userGiveAVaildPassword(String arg0) throws Throwable {
        password(arg0);
    }

    @Then("^Verify the title of the login page$")
    public void verifyTheTitleOfTheLoginPage() throws Throwable {
        get_text("AccessibilityId", "TitleBar");
    }


    @Then("^Verify the title of the Skype home page$")
    public void verifyTheTitleOfTheSkypeHomePage() throws Throwable {
        WindowTitle();
    }

    @When("^User logout$")
    public void userLogout() throws Throwable {
        logout();
    }
}
