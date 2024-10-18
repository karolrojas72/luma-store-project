package com.uam.automation.ui.stepdefinitions;

import com.uam.automation.ui.questions.GetText;
import com.uam.automation.ui.tasks.Login;
import com.uam.automation.ui.tasks.ReviewPayments;
import com.uam.automation.ui.tasks.SelectProduct;
import com.uam.automation.ui.tasks.ShippingFormAddress;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.containsString;
import static com.uam.automation.ui.userinterface.ReviewPaymentsPage.ALERT;


public class PurchaseStepDefinitions {
   
    @Given("{actor} is on the homepage {string} and {string}")
    public void navigatingOnInternet(Actor actor, String username, String password) {

        actor.wasAbleTo(
                Login.with(username,password)

        );
    }

    @When("{actor} completes the process of purchasing items {string} and {string} and {string} and {string} and " +
            "{string} and {string} and {string} and {string} and {string} and {string}")//devuelve un actor que le ingreso en
    public void submitsForm(Actor actor, String name, String lastname, String company, String streetAddress0,
                            String city, String state, String postalCode, String country, String phoneNumber,
                            String shippingMethods)
    {
        actor.attemptsTo(
                SelectProduct.with(),
                ShippingFormAddress.with(name,lastname, company,streetAddress0,city,state,postalCode,country,
                        phoneNumber,shippingMethods),
                ReviewPayments.with()
        );
    }

    @Then("{actor} transaction success message {string} is generated")
    public void shouldSeeFormSubmitted(Actor actor) {
        actor.should(
                seeThat("the purchase was submitted successfully",
                        GetText.fromTarget(ALERT), containsString("Thank you for your purchase!"))
                /*seeThat("the title was generated successfully",
                        GetText.fromTarget(TITLE), containsString("Check / Money order")),
                seeThat("the Subtitle was generated successfully",
                        GetText.fromTarget(CHECKBOX_TEXT), containsString("My billing and shipping address are the same")),
                seeThat("the order total text was generated successfully",
                        GetText.fromTarget(ORDER_TOTAL), containsString("Order Total"))*/

        );

    }
}
