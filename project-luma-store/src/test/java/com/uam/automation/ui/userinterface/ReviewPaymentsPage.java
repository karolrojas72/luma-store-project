package com.uam.automation.ui.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("https://magento.softwaretestingboard.com/checkout/#payment")
public class ReviewPaymentsPage {

    /*public static Target TITLE = Target.the("title").locatedBy("//span[contains(text(), 'Check / Money order')]");
    public static Target BILLING_SHIPPING = Target.the("billing shipping").locatedBy("//input[@id='checkbox-{1}']");
    public static Target CHECKBOX_TEXT = Target.the("checkbox text").locatedBy("//span[@data-bind=\"i18n: 'My billing and shipping address are the same'\"]");
    public static Target BILLING_ADDRESS_DETAILS = Target.the("billing address details").locatedBy("//div[@class=billing-address-details]");
    public static Target TOTALS_SHIPPING = Target.the("totals shipping").locatedBy("//tr[@class='totals shipping excl']");
    public static Target ORDER_TOTAL = Target.the("order total").locatedBy("//strong[@data-bind='i18n: title']");
    public static Target PRICE_SHIPPING = Target.the("price shipping").locatedBy("//span[1][@data-bind='text: getValue()']");
    public static Target APPLY_DISCOUNT_CODE = Target.the("Apply Discount Code").locatedBy("//span[@id=\"block-discount-heading\"]");
    public static Target DISCOUNT_CODE = Target.the("discount code").locatedBy("//input[@id=\"discount-code\"]");
    public static Target DISCOUNT_CODE_BUTTON = Target.the("Place Order").locatedBy("//button[@value=\"Apply Discount\"]");*/
    public static Target PLACE_ORDER_BUTTON = Target.the("Place Order").locatedBy("//button[@class='action primary checkout']");
    public static Target ALERT = Target.the("alert").locatedBy("//span[contains(text(), 'Thank you for your purchase!')]");

}