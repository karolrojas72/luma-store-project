package com.uam.automation.ui.tasks;


import com.uam.automation.ui.questions.IsStreetAddressEmpty;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import static com.uam.automation.ui.userinterface.ShippingPage.*;


public class ShippingFormAddress implements Task {
    private final String name;
    private final String lastname;
    private final String company;
    private final String streetAddress0;
    private final String city;
    private final String state;
    private final String postalCode;
    private final String country;
    private final String phoneNumber;
    private final String shippingMethods;

    public ShippingFormAddress (String name, String lastname, String company, String streetAddress0,
                                String city, String state, String postalCode, String country,
                                String phoneNumber, String shippingMethods) {
        this.name = name;
        this.lastname = lastname;
        this.company = company;
        this.streetAddress0 = streetAddress0;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.shippingMethods = shippingMethods;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        if(IsStreetAddressEmpty.value().answeredBy(actor))
         actor.attemptsTo(
                Enter.theValue(name).into(FIRST_NAME),
                Enter.theValue(lastname).into(LAST_NAME),
                Enter.theValue(company).into(COMPANY),
                Enter.theValue(streetAddress0).into(STREET_ADDRESS_0),
                Enter.theValue(city).into(CITY),
                SelectFromOptions.byVisibleText(state).from(STATE),
                Enter.theValue(postalCode).into(POSTAL_CODE),
                SelectFromOptions.byVisibleText(country).from(COUNTRY),
                Enter.theValue(phoneNumber).into(TELEPHONE),
                Click.on(SHIPPING_METHODS.of(shippingMethods)),
                Click.on(NEXT_BUTTON)
               //MoveMouse.to() mapear el atributo a o img

        );
        else {
            actor.attemptsTo(
                    Click.on(SHIPPING_METHODS.of(shippingMethods)),
                    Click.on(NEXT_BUTTON)

            );

        }
    }

    public static ShippingFormAddress with(String name, String lastname, String company, String streetAddress0,
                                           String city, String state,String postalCode, String country, String phoneNumber,
                                           String shippingMethods) {

        return new ShippingFormAddress(name, lastname, company, streetAddress0,city, state,
                postalCode, country, phoneNumber, shippingMethods);

    }

}
