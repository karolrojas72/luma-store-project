package com.uam.automation.ui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.uam.automation.ui.userinterface.ProductPage.*;

public class SelectProduct implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                NavigateTo.theFormPage(),
                Click.on(PRODUCT_OPTION),
                Click.on(PRODUCT_SIZE),
                Click.on(PRODUCT_COLOR),
                Enter.theValue("4").into(PRODUCT_QUANTITY),
                Click.on(ADD_TO_CART_BUTTON),
                Click.on(SHOPPING_CART),
                Click.on(PROCEED_TO_CHECKOUT_BUTTON)
                );
    }

    public static SelectProduct with() {
        return new SelectProduct();

    }
}
