package com.uam.automation.ui.stepdefinitions;


import com.uam.automation.ui.questions.GetText;
import com.uam.automation.ui.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static com.uam.automation.ui.userinterface.HomePage.ALERT_INVALID;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class InvalidStepDefinitions {

    @Given("{actor} is on the homepage {string} and {string}")
    public void navigatingOnInternet(Actor actor, String username, String password) {

        actor.wasAbleTo(
                Login.with(username,password)

        );
    }

    @When("{actor} submits the login form with invalid credentials")
    public void submitsForm(Actor actor) {
        actor.attemptsTo(

        );
    }

    @Then("{actor} an error message {string} is displayed")
    public void shouldSeeFormSubmitted(Actor actor) {
        actor.should(
                seeThat("the form was not submitted successfully",
                        GetText.fromTarget(ALERT_INVALID), containsString("The account sign-in was incorrect " +
                                "or your account is disabled temporarily. Please wait and try again later."))
        );
    }
}
