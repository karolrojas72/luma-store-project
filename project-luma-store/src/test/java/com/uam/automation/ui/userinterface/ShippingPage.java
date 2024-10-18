package com.uam.automation.ui.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//@DefaultUrl("https://magento.softwaretestingboard.com/checkout/#shipping")
public class ShippingPage {

    public static Target FIRST_NAME = Target.the("first name").locatedBy("//input[@name='firstname']");
    public static Target LAST_NAME = Target.the("last name").locatedBy("//input[@name='lastname']");
    public static Target COMPANY = Target.the("company").locatedBy("//input[@name='company']");
    public static Target STREET_ADDRESS_0 = Target.the("street address 0").locatedBy("//input[@name='street[0]']");
    //public static Target STREET_ADDRESS_1 = Target.the("street address 1").locatedBy("//input[@name='street[1]']");
    //public static Target STREET_ADDRESS_2 = Target.the("street address 2").locatedBy("//input[@name='street[2]']");
    public static Target CITY = Target.the("city").locatedBy("//input[@name='city']");
    public static Target STATE = Target.the("state").locatedBy("//select[@name='region_id']");
    public static Target POSTAL_CODE = Target.the("postal code").locatedBy("//input[@name='postcode']");
    public static Target COUNTRY = Target.the("country").locatedBy("//select[@name='country_id']");
    public static Target TELEPHONE = Target.the("telephone").locatedBy("//input[@name='telephone']");
    public static Target SHIPPING_METHODS = Target.the("shipping methods").locatedBy("//input[@name='ko_unique_1']");
    public static Target NEXT_BUTTON = Target.the("Next").locatedBy("//button[@class='button action continue primary']");

}
