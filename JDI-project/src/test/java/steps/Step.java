package steps;

import com.epam.web.matcher.junit.Assert;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Roman_Nikolaev on 6/5/2017.
 */
public class Step {

    @Given("^I'm on home page$")
    public void iMOnHomePage() throws Throwable {
        System.out.println("You on home page\n");
    }

    @When("^I type credentials as ([^\\\"]*)/([^\\\"]*)$")
    public void iTypeCredentialsAsUserUser(String username, String password) throws Throwable {
        System.out.println(username + "/" + password + "\n");
    }

    @Then("^Profile name is visible$")
    public void profileNameIsVisible() throws Throwable {
        Assert.isTrue(true);
    }

    @Then("^Profile name is visible ([^\\\"]*)/([^\\\"]*)$")
    public void profileNameIsVisibleNameBool(String name, boolean bool) throws Throwable {
        if (bool){
            System.out.println("name: " + name + ", " + "bool: " + bool + " It is when bool = true\n");
        } else {
            System.out.println("name: " + name + ", " + "bool: " + bool + " It is when bool = false\n");
        }
    }
}
