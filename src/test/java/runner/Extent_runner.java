package runner;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

/**
 * Created by bhanu_000 on 01-06-2017.
 */

@CucumberOptions(features = "src\\test\\java\\feature", glue = "Stepdefinition",tags = {"@skype"},dryRun = false, plugin = {"html:target/cucumber-htmlreport",
        "json:target/cucumber-report.json", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})
public class Extent_runner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void setup() {
        Reporter.setSystemInfo("os", "Windows 10");
        Reporter.setSystemInfo("Software","Selenium,winapp driver");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}

