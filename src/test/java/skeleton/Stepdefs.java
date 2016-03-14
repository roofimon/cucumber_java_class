package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class Stepdefs {
    private Fizzbuzz fizzbuzz;
    private String actual;

    @Given("^We want to count normal value with Fizzbuzz$")
    public void we_want_to_count_normal_value_with_Fizzbuzz() throws Throwable {
        fizzbuzz = new Fizzbuzz();
    }

    @When("^I count (\\d+)$")
    public void i_count(int arg1) throws Throwable {
        this.actual = fizzbuzz.count(arg1);
    }

    @Then("^I got in \"(.*?)\"$")
    public void i_got_in(String arg1) throws Throwable {
        assertEquals(arg1, actual);
    }
}
