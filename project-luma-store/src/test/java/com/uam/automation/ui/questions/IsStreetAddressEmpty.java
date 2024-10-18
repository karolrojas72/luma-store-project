package com.uam.automation.ui.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
//import static com.uam.automation.ui.userinterface.ShippingPage.STREET_ADDRESS_0;
import static com.uam.automation.ui.userinterface.ShippingPage.POSTAL_CODE;


public class IsStreetAddressEmpty implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        //Return address field text and verify its empty
        return Text.of(POSTAL_CODE).answeredBy(actor).isEmpty();

    }

    public static IsStreetAddressEmpty value() {

        return new IsStreetAddressEmpty();
    }
}
