package resources.hellocucumber;

import io.cucumber.java.en.*;
import static org.testng.Assert.assertEquals;

class IsItFriday{
    static String isItFriday(String today){
        return null;
    }
}

public class MyStepdefs {
    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void todayIsSunday() {
        today = "Sunday";
    }

    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

}
