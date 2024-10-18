package com.uam.automation.ui.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.uam.automation.ui.userinterface.ReviewPaymentsPage.*;

public class ReviewPayments implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PLACE_ORDER_BUTTON)
        );
    }

    public static ReviewPayments with() {
        return new ReviewPayments();

    }
}
