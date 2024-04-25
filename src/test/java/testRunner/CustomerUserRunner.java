package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"/home/active30/eclipse-workspace/Xsquare/src/test/resources/Features/CustomerPortal/Setting/Users/AddUsers.feature",
		         "/home/active30/eclipse-workspace/Xsquare/src/test/resources/Features/CustomerPortal/Setting/Users/UpdateUsers.feature",
		         "/home/active30/eclipse-workspace/Xsquare/src/test/resources/Features/CustomerPortal/Setting/Users/UsersHome.feature"},
                 glue = "stepDefinitions",
                 monochrome = true,
                 plugin = "html:Reports/Customer-User",
                 dryRun = false
		             
		         )



public class CustomerUserRunner 
{

}
