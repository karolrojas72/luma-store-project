package com.uam.automation.ui.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://magento.softwaretestingboard.com/")
public class HomePage extends PageObject {

        public static Target SIGN_IN_OPTION = Target.the("login option").locatedBy("(//a[contains(text(),'Sign In')])[1]");
        public static Target EMAIL_FIELD = Target.the("email field").located(By.id("email"));
        public static Target PASSWORD_FIELD = Target.the("password field").located(By.id("pass"));
        public static Target SIGN_IN_BUTTON = Target.the("Sign In button").located(By.id("send2"));
        public static Target ALERT_INVALID = Target.the("message-error").locatedBy("//div[contains(text(), 'The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.')]\n");



        //span[contains(text(), 'Thank you for your purchase!')]
        //pop up botón cerrar id="dismiss-button"
        /*public static Target CUSTOMER_EMAIL_FIELD = Target.the("email field").located(org.openqa.selenium.By.id("customer-email"));
        public static Target CUSTOMER_PASSWORD_FIELD = Target.the("password field").located(org.openqa.selenium.By.id("customer-password"));
        public static Target CUSTOMER_LOGIN_BUTTON = Target.the("login button").located(By.id("customer-email-fieldset"));*/

}
