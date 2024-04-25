package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = {"/home/active30/eclipse-workspace/Xsquare/src/test/resources/Features/CustomerPortal/Login/CustomerLogin.feature"},
                  glue = "stepDefinitions",
                  plugin = "html:Reports/customer-login",
                  monochrome = true,
                  dryRun = false
                  
		)


public class LoginRunner {

}
