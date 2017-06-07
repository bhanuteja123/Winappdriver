package Stepdefinition;

import com.cucumber.listener.Reporter;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import methods.Outlook_cucumber;

import java.net.MalformedURLException;

/**
 * Created by bhanu_000 on 01-06-2017.
 */
public class MyStepdefs extends Outlook_cucumber {
    @Then("^Close the window$")
    public void closeTheWindow() throws Throwable {
        close();
        Reporter.setTestRunnerOutput("Application closed");
    }

    @Given("^User opened the outlook application$")
    public void userOpenedTheOutlookApplication() throws Throwable {
        try {
            open();
            Reporter.setTestRunnerOutput("Application got opened");
        } catch (MalformedURLException e) {
            System.out.println("error at start");
            e.printStackTrace();
        }
    }

    @Then("^Verify the title$")
    public void verifyTheTitle() throws Throwable {
        WindowTitle();
    }

    @When("^User Creates a new mail$")
    public void userCreatesANewMail() throws Throwable {
        try {
            new_mail();
            Reporter.setTestRunnerOutput("created a new mail");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @When("^User click on sent mails$")
    public void userClickOnSentMails() throws Throwable {
        try {
            sent_mail();
            Reporter.setTestRunnerOutput("Opened the sent mails");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
